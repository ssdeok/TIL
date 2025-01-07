package com.example.relation.domain.comment.dto;

import com.example.relation.domain.comment.Comment;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder // 자동으로 all 생성
public class CommentResponseDto {
    private final Long id;
    private final String content;
//    private final post_id / post
    private final LocalDateTime createAt;

    public static CommentResponseDto from(Comment entity) {
        return CommentResponseDto.builder()
                .id(entity.getId())
                .content(entity.getContent())
                .createAt(entity.getCreatedAt())
                .build();
    }
}
