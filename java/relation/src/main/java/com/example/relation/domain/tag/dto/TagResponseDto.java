package com.example.relation.domain.tag.dto;

import com.example.relation.domain.comment.Comment;
import com.example.relation.domain.comment.dto.CommentResponseDto;
import com.example.relation.domain.tag.Tag;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class TagResponseDto {
    private final Long id;
    private final String name;

    public static TagResponseDto from(Tag entity) {
        return TagResponseDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
