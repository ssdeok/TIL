package com.example.personalpractice.mysite.mysitev4.dto;

import com.example.personalpractice.mysite.mysitev4.PostV4;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public static PostResponseDto from(PostV4 entity) {
        return PostResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .author(entity.getAuthor())
                .build();
    }
}
