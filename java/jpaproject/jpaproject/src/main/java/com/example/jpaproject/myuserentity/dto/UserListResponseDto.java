package com.example.jpaproject.myuserentity.dto;

import com.example.jpaproject.myuserentity.PostUser;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserListResponseDto {

    private Long id;

    private String username;
    private String email;
    private String nickname;
    private int age;
    private boolean isActive;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public static UserListResponseDto from(PostUser entity) {

        return UserListResponseDto.builder()
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
