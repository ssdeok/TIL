package com.example.personalpractice.mysite.mysitev5.dto;

import com.example.personalpractice.mysite.mysitev5.PostV5;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostCreateRequestDto {

    private String title;
    private String content;
    private String author;

    public PostV5 toEntity() {
        return PostV5.builder()
                .title(this.title)
                .content(this.content)
                .author(this.author)
                .build();
    }
}
