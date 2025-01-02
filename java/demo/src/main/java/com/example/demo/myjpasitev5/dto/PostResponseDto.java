package com.example.demo.myjpasitev5.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponseDto {
    private final Long id;

    private final String title;
    private final String content;
    private final String author;


}
