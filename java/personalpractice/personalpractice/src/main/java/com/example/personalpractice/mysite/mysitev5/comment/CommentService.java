<<<<<<< HEAD
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
=======
package com.example.personalpractice.mysite.mysitev5.comment;

import com.example.personalpractice.global.ResourceNotFoundException;
import com.example.personalpractice.mysite.mysitev5.PostRepositoryV5;
import com.example.personalpractice.mysite.mysitev5.PostV5;
import com.example.personalpractice.mysite.mysitev5.dto.CommentRequestDto;
import com.example.personalpractice.mysite.mysitev5.dto.CommentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepositoryV5 postRepositoryV5;

    @Transactional
    public CommentResponseDto createComment(Long postId, CommentRequestDto requestDto) {
        PostV5 postV5 = postRepositoryV5.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException());

        Comment comment = requestDto.toEntity(postV5);

        return CommentResponseDto.from(commentRepository.save(comment));
    }

    @Transactional
    public CommentResponseDto updateComment(Long postId, Long commentId, CommentRequestDto requestDto) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException());
        comment.update(requestDto);
        return CommentResponseDto.from(comment);
    }
}
>>>>>>> 2f287f7f192eb5f57a93c021c47ffa1b20e07f49
