package com.example.demo.myjpasitev4.dto;

import com.example.demo.myjpasitev4.PostV4;
import lombok.Getter;
import lombok.NoArgsConstructor;

// title, content, author를 받아다가
// 우리의 Post로 만드는 역할을 하겠어.
@Getter
public class PostUpdateRequestDto {
    private String title;
    private String content;

}
