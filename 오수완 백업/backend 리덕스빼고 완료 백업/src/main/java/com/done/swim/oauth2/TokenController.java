package com.done.swim.oauth2;

import com.done.swim.global.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class TokenController {

    private final OAuth2TokenService oAuth2TokenService;
    private final JwtTokenProvider jwtTokenProvider;

    // refreshtoken을 쿠키로 보낸다면 @cookievalue 필요
    @PostMapping("/reissue")
    public ResponseEntity<?> reissueAccessToken(
        @CookieValue(name = "refreshToken", required = false)
        String refreshToken) {
        return oAuth2TokenService.reissueAccessToken(refreshToken);
    }

    @GetMapping("/check-refresh-token")
    public String checkRefreshToken(@RequestParam String userId) {
        // 해당 userId에 대한 리프레시 토큰 조회
        String refreshToken = jwtTokenProvider.getRefreshTokenFromRedis(userId);

        if (refreshToken != null) {
            return "리프레시 토큰: " + refreshToken;
        } else {
            return "리프레시 토큰이 존재하지 않습니다.";
        }
    }
}
