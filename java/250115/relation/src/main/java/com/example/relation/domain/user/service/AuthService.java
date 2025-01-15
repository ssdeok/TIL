package com.example.relation.domain.user.service;

import com.example.relation.domain.user.UserRepository;
import com.example.relation.domain.user.dto.TokenResponseDto;
import com.example.relation.domain.user.dto.request.LoginRequestDto;
import com.example.relation.domain.user.dto.request.SignupRequestDto;
import com.example.relation.domain.user.dto.response.SignupResponseDto;
import com.example.relation.domain.user.entity.User;
import com.example.relation.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    // @RequiredArgsConstructor 로 대체
//    @Autowired
//    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }

    @Transactional
    public SignupResponseDto signup(SignupRequestDto requestDto) {

        if(userRepository.existsByUsername(requestDto.getUsername())){
            throw new IllegalArgumentException("이미 사용중인 아이디입니다.");
        }

        if (userRepository.existsByEmail(requestDto.getEmail())){
            throw new IllegalArgumentException("이미 사용중인 이메일입니다.");
        }

        String encodedPassword = passwordEncoder.encode(requestDto.getPassword());

        User user = requestDto.toEntity(encodedPassword);

        return SignupResponseDto.from(userRepository.save(user));
    }



    //1. DTO를 받습니다.
    public TokenResponseDto login(LoginRequestDto requestDto){
        // 3. 객체로 만든 것을 manager에게 통과시켜 인증 정보가 들어있는 "authentication"객체를 만듭니다.
        // 4. "authenticationManager"를 활용하기 위해 DI을 해줍니다 => security config로 이동
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        // 2. DTO로 부터 온 정보를 객체로 만듭니다.
                        requestDto.getUsername(),
                        requestDto.getPassword()
                )
        );

        // 5. jwt 프로로바이더를 DI해줘야 한다 ->JwtTokenProvider를 만들어주자.
        // security / jwt / jwtTokenProvider
        String jwt = jwtTokenProvider.createToken(authentication);

        return new TokenResponseDto(jwt);
    }

















}
