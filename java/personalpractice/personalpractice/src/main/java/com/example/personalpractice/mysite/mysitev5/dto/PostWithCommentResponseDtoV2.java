<<<<<<< HEAD
//package com.example.personalpractice.mysite.mysitev5.dto;
//
//import com.example.personalpractice.mysite.mysitev5.PostV5;
//import com.example.personalpractice.mysite.mysitev5.comment.Comment;
//import lombok.Builder;
//import lombok.Getter;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Getter
//@Builder
//public class PostWithCommentResponseDtoV2 {
//
//    private final Long id;
//    private final String title;
//    private final String content;
//    private final String author;
//    private final LocalDateTime createdAt;
//    private final LocalDateTime updatedAt;
//    private final List<CommentResponseDto> comments;
//
=======
package com.example.personalpractice.mysite.mysitev5.dto;

import com.example.personalpractice.mysite.mysitev5.PostV5;
import com.example.personalpractice.mysite.mysitev5.comment.Comment;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class PostWithCommentResponseDtoV2 {

    private final Long id;
    private final String title;
    private final String content;
    private final String author;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    private final List<CommentResponseDto> comments;

>>>>>>> 2f287f7f192eb5f57a93c021c47ffa1b20e07f49
//    public static PostWithCommentResponseDtoV2 from(PostV5 entity) {
//        return PostWithCommentResponseDtoV2.builder()
//                .id(entity.getId())
//                .title(entity.getTitle())
//                .content(entity.getContent())
//                .author(entity.getAuthor())
//                .comments(
//                        comments.stream().map(CommentResponseDto::from).toList()
//                )
//                .createdAt(entity.getCreatedAt())
//                .updatedAt(entity.getUpdatedAt())
//                .build();
//    }
<<<<<<< HEAD
//}
=======

    public static PostWithCommentResponseDtoV2 from(PostV5 entity) {
        return PostWithCommentResponseDtoV2.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .author(entity.getAuthor())
                .comments(
                        entity.getComments().stream().map(CommentResponseDto::from).toList()
                )
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
>>>>>>> 2f287f7f192eb5f57a93c021c47ffa1b20e07f49
