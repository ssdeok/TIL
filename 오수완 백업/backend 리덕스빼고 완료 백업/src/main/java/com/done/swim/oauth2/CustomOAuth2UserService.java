package com.done.swim.oauth2;

import com.done.swim.domain.user.entity.User;
import com.done.swim.domain.user.repository.UserRepository;
import com.done.swim.oauth2.provider.KakaoUserInfo;
import com.done.swim.oauth2.provider.NaverUserInfo;
import com.done.swim.oauth2.provider.OAuth2UserInfo;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    // CustomOAuth2UserService : OAuth2 사용자 정보 처리 (사용자 인증 로직)

    private final UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        log.info("✅ CustomOAuth2UserService.loadUser() 실행됨!");

        // 액세스 토큰 추출
        String kakaoAccessToken = userRequest.getAccessToken().getTokenValue();
        log.info("✅카카오 액세스 토큰: {}", kakaoAccessToken);  // 액세스 토큰을 로그에 출력

        OAuth2User oAuth2User = super.loadUser(userRequest);

        // 어떤 OAuth2 제공자인지 확인 (네이버 or 카카오)
        String registrationId = userRequest.getClientRegistration().getRegistrationId();
        log.info("🔍 OAuth2 제공자: {}", registrationId);
        OAuth2UserInfo oAuth2UserInfo;

        // 네이버는 카카오랑 로직 달라서 바꿔야함 (    // response 키 안에 사용자 정보 있음 (네이버))
        // 네이버의 경우 response 객체 내부의 id를 사용해야 함
        // 네이버 로그인 시 id 속성이 null이어서 발생하는 오류 -> userNameAttributeName 가져옴
        if ("naver".equals(registrationId)) {
            Map<String, Object> responseMap = (Map<String, Object>) oAuth2User.getAttributes()
                .get("response");
            if (responseMap == null) {
                throw new OAuth2AuthenticationException("네이버 OAuth2 응답에서 response 필드를 찾을 수 없습니다.");
            }
            oAuth2UserInfo = new NaverUserInfo(responseMap);  // 내부 response 값을 전달
        } else if ("kakao".equals(registrationId)) {
            oAuth2UserInfo = new KakaoUserInfo(oAuth2User.getAttributes());
        } else {
            throw new OAuth2AuthenticationException("지원하지 않는 소셜 로그인입니다.");
        }

        log.info("🔑 가져온 사용자 정보: {}", oAuth2User.getAttributes());
        User user = userRepository.findByEmail(oAuth2UserInfo.getEmail())
            .orElseGet(() -> userRepository.save(User.builder()
                .email(oAuth2UserInfo.getEmail())
                .nickname(oAuth2UserInfo.getNickname())
                .imageUrl(oAuth2UserInfo.getUserImageUrl())
                .provider(oAuth2UserInfo.getProvider().name())
                .providerId(oAuth2UserInfo.getProviderId())
                .build()));

        // 카카오 로그인인 경우 카카오 액세스 토큰 저장
        if ("kakao".equals(registrationId)) {
            user.setKakaoAccessToken(kakaoAccessToken);
            userRepository.save(user);
            log.info("✅ 카카오 액세스 토큰 저장 완료: {}", kakaoAccessToken);
        }

        // 이메일을 로그로 출력하여 확인
        log.info("OAuth2User에서 추출한 이메일: {}", oAuth2UserInfo.getEmail());

        return new CustomOAuth2User(user, oAuth2User);
    }
}
