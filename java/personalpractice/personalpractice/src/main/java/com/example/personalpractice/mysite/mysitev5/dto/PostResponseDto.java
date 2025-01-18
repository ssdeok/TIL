package com.example.personalpractice.mysite.mysitev5.dto;

import com.example.personalpractice.mysite.mysitev5.PostV5;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public static PostResponseDto from(PostV5 entity) {
        return PostResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .author(entity.getAuthor())
                .build();
    }
}
