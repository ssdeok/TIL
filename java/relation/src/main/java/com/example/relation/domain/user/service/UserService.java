package com.example.relation.domain.user.service;

import com.example.relation.domain.post.Post22Repository;
import com.example.relation.domain.post.dto.Post2ListWithPageResponseDto;
import com.example.relation.domain.user.Post2Repositry;
import com.example.relation.domain.user.UserRepository;
import com.example.relation.domain.user.dto.response.UserResponseDto;
import com.example.relation.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final Post22Repository post22Repository;

    public UserResponseDto getMyProfile(User user) {
        return UserResponseDto.from(user);
    }

    public Post2ListWithPageResponseDto getMyPosts(User user, Pageable pageable) {
        return Post2ListWithPageResponseDto.from(
                post22Repository.findAllByAuthorId(user.getId(), pageable));
    }
}
