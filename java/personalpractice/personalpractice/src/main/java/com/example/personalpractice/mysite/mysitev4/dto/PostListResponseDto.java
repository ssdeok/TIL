package com.example.personalpractice.mysite.mysitev4.dto;

import com.example.personalpractice.mysite.mysitev4.PostV4;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostListResponseDto {
    private Long id;
    private String title;

    public static PostListResponseDto from(PostV4 entity) {
        return PostListResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .build();
    }
}
