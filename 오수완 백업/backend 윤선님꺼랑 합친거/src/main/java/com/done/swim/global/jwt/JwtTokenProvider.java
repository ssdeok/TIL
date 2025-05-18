package com.done.swim.global.jwt;

import com.done.swim.domain.user.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;

@Component
public class JwtTokenProvider {

    private final long accessTokenValidityInMilliseconds = 1000L * 60 * 60; // 1시간
    private final long refreshTokenValidityInMilliseconds = 1000L * 60 * 60 * 24 * 30; // 30일

    @Value("${jwt.secret}")
    private String secretKey;

    @PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }

    // jwt 생성 메서드
    public String createToken(Authentication authentication, User user, long expirationTime) {
        String username = authentication.getName();
        Long id = user.getId();

        Claims claims = Jwts.claims();
        claims.put("id", id);
        claims.put("username", username);

        Date now = new Date();
        Date validity = new Date(now.getTime() + expirationTime);

        // jwt 토큰 생성 및 반환
        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(Keys.hmacShaKeyFor(secretKey.getBytes()), SignatureAlgorithm.HS256)
                .compact();
    }

    // 액세스 토큰 생성
    public String createAccessToken(Authentication authentication, User user) {
        return createToken(authentication, user, accessTokenValidityInMilliseconds);
    }

    // 리프레시 토큰 생성
    public String createRefreshToken(Authentication authentication, User user) {
        return createToken(authentication, user, refreshTokenValidityInMilliseconds);
    }

    // jwt 유효성 검증
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(Keys.hmacShaKeyFor(secretKey.getBytes()))
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public String getUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(secretKey.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody()
                .get("username", String.class);
    }

    public Long getUserId(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(secretKey.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody()
                .get("id", Long.class);
    }
}
