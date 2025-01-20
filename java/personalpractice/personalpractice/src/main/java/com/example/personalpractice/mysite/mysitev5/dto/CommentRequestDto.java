package com.example.personalpractice.mysite.mysitev5.dto;

import com.example.personalpractice.mysite.mysitev5.PostV5;
import com.example.personalpractice.mysite.mysitev5.comment.Comment;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Getter
@NoArgsConstructor
public class CommentRequestDto {

    @NotBlank
    @Length(min = 5)
    private String content;

    public Comment toEntity(PostV5 postV5) {
        return Comment.builder()
                .content(this.content)
                .postV5(postV5)
                .build();
    }
}
