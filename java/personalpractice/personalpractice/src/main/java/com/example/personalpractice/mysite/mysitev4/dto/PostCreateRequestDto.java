package com.example.personalpractice.mysite.mysitev4.dto;

import com.example.personalpractice.mysite.Post;
import com.example.personalpractice.mysite.mysitev4.PostV4;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostCreateRequestDto {

    private String title;
    private String content;
    private String author;

    public PostV4 toEntity() {
        return PostV4.builder()
                .title(this.title)
                .content(this.content)
                .author(this.author)
                .build();
    }
}
