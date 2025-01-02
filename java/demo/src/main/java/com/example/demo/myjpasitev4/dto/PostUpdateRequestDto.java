package com.example.demo.myjpasitev4.dto;

import com.example.demo.myjpasitev4.PostV4;
import lombok.Getter;
import lombok.NoArgsConstructor;

// title, content, author를 받아다가
// 우리의 Post로 만드는 역할을 하겠어.
@Getter
// 없어도 됨
//@NoArgsConstructor // 필요하지만, 이 경우는 기본 생성자를 자동으로 만들어주기때문에 필요없음
public class PostUpdateRequestDto {
    private String title;
    private String content;

//    public PostV4 toEntity() {
//        return PostV4.builder()
//                .title(this.title)
//                .content(this.content)
//                .build();
//        // return new PostV4(title, content, author);
//    }
}
