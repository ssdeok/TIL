package com.example.personalpractice.mysite.mysitev5.comment;

import com.example.personalpractice.mysite.mysitev5.BaseTimeEntity;
import com.example.personalpractice.mysite.mysitev5.PostV5;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "postV5_id")
    private PostV5 postV5;



    @Builder
    public Comment(PostV5 postV5, String content) {
        setPostV5(postV5);
        this.content = content;
    }

    public void setPostV5(PostV5 postV5) {
        this.postV5 = postV5;
        postV5.getComments().add(this);
    }
}
