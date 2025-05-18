package com.done.swim.oauth2.controller;

import com.done.swim.domain.user.entity.User;
import com.done.swim.global.jwt.JwtTokenProvider;
import com.done.swim.oauth2.CustomOAuth2User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final JwtTokenProvider jwtTokenProvider;
    private final RedisTemplate<String, String> redisTemplate;

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @PostMapping("/refresh")
    public ResponseEntity<?> refreshAccessToken(HttpServletRequest request,
        HttpServletResponse response) {
        // 쿠키에서 리프레시 토큰 가져오기
        Cookie[] cookies = request.getCookies();
        String refreshToken = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("refreshToken")) {
                    refreshToken = cookie.getValue();
                }
            }
        }

        // 리프레시 토큰이 없으면 401 응답
        if (refreshToken == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("리프레시 토큰이 없습니다.");
        }

        // 리프레시 토큰 유효성 검증
        if (!jwtTokenProvider.validateToken(refreshToken)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("유효하지 않은 리프레시 토큰입니다.");
        }

        // 토큰에서 사용자 ID 추출
        Long userId = jwtTokenProvider.getUserId(refreshToken);

        // Redis에서 저장된 리프레시 토큰과 비교
        String storedRefreshToken = redisTemplate.opsForValue().get(userId.toString());
        if (storedRefreshToken == null || !storedRefreshToken.equals(refreshToken)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("리프레시 토큰이 유효하지 않거나 만료되었습니다.");
        }

        // 새로운 액세스 토큰 발급
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = ((CustomOAuth2User) authentication.getPrincipal()).getUser();
        String newAccessToken = jwtTokenProvider.createAccessToken(authentication, user);

        // 액세스 토큰을 응답으로 반환
        return ResponseEntity.ok().header("Authorization", "Bearer " + newAccessToken)
            .body("새로운 액세스 토큰이 발급되었습니다.");
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(
        @CookieValue(name = "refreshToken", required = false) String refreshToken,
        HttpServletResponse response) {

        // 로그아웃 처리 전에 refreshToken을 로그로 출력
        System.out.println("로그아웃 처리 완료, refreshToken: " + refreshToken);

        if (refreshToken != null) {
            redisTemplate.delete(refreshToken); // Redis에서 리프레시 토큰 삭제
        }

        // 쿠키 삭제 (클라이언트에서 삭제될 수 있도록 설정)
        ResponseCookie cookie = ResponseCookie.from("refreshToken", "")
            .httpOnly(true)
            .secure(false)
            .path("/")
            .maxAge(0)
            .sameSite("None") // SameSite=None으로 설정 (타 도메인에서도 전송되도록)
            .build();
        response.addHeader("Set-Cookie", cookie.toString());

        System.out.println("로그아웃 처리 완료"); // 로그 출력 추가
        return ResponseEntity.ok("로그아웃 완료");
    }
}
