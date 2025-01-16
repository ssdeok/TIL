package com.example.relation.domain.user.service;

import com.example.relation.domain.user.dto.request.LoginRequestDto;
import com.example.relation.domain.user.dto.response.TokenResponseDto;
import com.example.relation.domain.user.entity.User;
import com.example.relation.domain.user.UserRepository;
import com.example.relation.domain.user.dto.request.SignupRequestDto;
import com.example.relation.domain.user.dto.response.SignUpResponseDto;
import com.example.relation.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    @Transactional
    public SignUpResponseDto signup(SignupRequestDto requestDto) {

        if (userRepository.existsByUsername(requestDto.getUsername())) {
            throw new IllegalArgumentException("이미 사용중인 아이디입니다.");
        }

        if (userRepository.existsByEmail(requestDto.getEmail())) {
            throw new IllegalArgumentException("이미 사용중인 이메일입니다.");
        }

        String encodedPassword = passwordEncoder.encode(requestDto.getPassword());

        User user = requestDto.toEntity(encodedPassword);

       return SignUpResponseDto.from(userRepository.save(user));
    }


    // 1. DTO를 받습니다.
    public TokenResponseDto login(LoginRequestDto requestDto){
        // 3. 객체로 만든 것을 manager에게 통과시켜 인증 정보가 들어있는 "authentication"객체를 만듭니다.
        // 4. "authenticationmanager"를 활용하기 위해 DI를 해줍니다 => security config로 이동

        // authentication 이게 응 맞아 이부분임
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        // 2. DTO로 부터 온 정보를 객체로 만듭니다.
                        requestDto.getUsername(),
                        requestDto.getPassword()
                )
        );

        // 5. 사용자에 대한 인증정보가 들어있는 authenticatioh를 활용해서
        // SecurityContext라는 곳에 인증정보를 저장한다.
//        SecurityContextHolder.getContext().setAuthentication(authentication);

        // 6. jwt 프로바이더를 DI해줘야 함
        String jwt = jwtTokenProvider.createToken(authentication);

        return new TokenResponseDto(jwt);
    }
}


















