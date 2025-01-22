package com.example.personalpractice.mysite.mysitev5;

import com.example.personalpractice.mysite.mysitev5.comment.Comment;
import com.example.personalpractice.mysite.mysitev5.dto.PostUpdateRequestDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostV5 extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String title;
    private String content;
    private String author;

    @Builder
    public PostV5(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @OneToMany(mappedBy = "postV5")
    private List<Comment> comments = new ArrayList<>();

    public PostV5 update(PostUpdateRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        return this;
    }
}
