package com.example.jpaproject.myuserentity;

import com.example.jpaproject.myuserentity.dto.UserCreateRequestDto;
import com.example.jpaproject.myuserentity.dto.UserListResponseDto;
import com.example.jpaproject.myuserentity.dto.UserResponseDto;
import com.example.jpaproject.myuserentity.dto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto createPost(UserCreateRequestDto requestDto) {
        PostUser postUser = userRepository.save(requestDto.toEntity());
        return UserResponseDto.from(postUser);

//        if (username == null || username.isBlank()) {
//            throw new RuntimeException("username을 입력하시오.");
//        }
//
//        if (email == null || email.isBlank()) {
//            throw new IllegalArgumentException("email을 입력하시오.");
//        }
//
//        if (nickname == null || nickname.isBlank()) {
//            throw new IllegalArgumentException("nickname을 입력하시오.");
//        }
//
//        if (age <= 0) {
//            throw new IllegalArgumentException("유효한 age를 입력하시오.");
//        }
//
//        if (!isActive) {
//            throw new IllegalArgumentException("isActive 상태가 유효하지 않습니다.");
//        }
//
//        return userRepository.save(newPost);
    }

    public List<UserListResponseDto> readPosts () {
        return userRepository.findAll().stream()
                .map(UserListResponseDto::from)
                .toList();
    }

    public UserResponseDto readPostById(Long id) {
       PostUser postUser = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        return UserResponseDto.from(postUser);
    }

    @Transactional
    public UserResponseDto updatePost(Long id, UserUpdateRequestDto requestDto) {
        PostUser postUser = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
        postUser.update(requestDto);
//        String newUserName = updatedPost.getUsername();
//        String newEmail = updatedPost.getEmail();
//        String newNickname = updatedPost.getNickname();
//        int newAge = updatedPost.getAge();
//        boolean newIsActive = updatedPost.isActive();
//
//        postUser.update(newUserName, newEmail, newNickname, newAge, newIsActive);

        return UserResponseDto.from(postUser);
    }

    @Transactional
    public void deletePost(Long id) {
        PostUser postUser = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
        userRepository.delete(postUser);
        }

}
