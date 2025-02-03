//package com.example.personalpractice.mysite.mysitev5.comment;
//
//import com.example.personalpractice.global.ResourceNotFoundException;
//import com.example.personalpractice.mysite.mysitev5.PostRepositoryV5;
//import com.example.personalpractice.mysite.mysitev5.PostV5;
//import com.example.personalpractice.mysite.mysitev5.dto.CommentRequestDto;
//import com.example.personalpractice.mysite.mysitev5.dto.CommentResponseDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@RequiredArgsConstructor
//@Transactional(readOnly = true)
//public class CommentService {
//    private final CommentRepository commentRepository;
//    private final PostRepositoryV5 postRepositoryV5;
//
//    @Transactional
//    public CommentResponseDto createComment(Long postId, CommentRequestDto requestDto) {
//        PostV5 postV5 = postRepositoryV5.findById(postId)
//                .orElseThrow(() -> new ResourceNotFoundException());
//
//        Comment comment = requestDto.toEntity(postV5);
//
//        return CommentResponseDto.from(commentRepository.save(comment));
//    }
//}
