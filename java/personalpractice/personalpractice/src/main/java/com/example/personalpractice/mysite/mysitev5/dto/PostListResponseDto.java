package com.example.personalpractice.mysite.mysitev5.dto;

import com.example.personalpractice.mysite.mysitev5.PostV5;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostListResponseDto {
    private Long id;
    private String title;

    public static PostListResponseDto from(PostV5 entity) {
        return PostListResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .build();
    }
}
