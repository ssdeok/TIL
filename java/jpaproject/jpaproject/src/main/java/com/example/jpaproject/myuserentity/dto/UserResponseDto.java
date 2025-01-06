package com.example.jpaproject.myuserentity.dto;

import com.example.jpaproject.myuserentity.PostUser;
import com.example.jpaproject.myuserentity.UserRepository;
import lombok.Builder;
import lombok.Getter;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserResponseDto {
    private final Long id;
    private final String username;
    private final String email;
    private final String nickname;
    private final int age;
    private final boolean isActive;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public static UserResponseDto from(PostUser entity) {

        return UserResponseDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .nickname(entity.getNickname())
                .age(entity.getAge())
                .isActive(entity.isActive())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
