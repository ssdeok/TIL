//package com.example.personalpractice.mysite.mysitev5;
//
//import com.example.personalpractice.mysite.mysitev5.comment.Comment;
//import com.example.personalpractice.mysite.mysitev5.comment.CommentRepository;
//import com.example.personalpractice.mysite.mysitev5.dto.*;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional(readOnly = true)
//@RequiredArgsConstructor
//public class PostServiceV5 {
//    private final PostRepositoryV5 postRepositoryV5;
//    private final CommentRepository commentRepository;
//
//    @Transactional
//    public PostResponseDto createPost(PostCreateRequestDto requestDto) {
//        PostV5 postV5 = postRepositoryV5.save(requestDto.toEntity());
//        return PostResponseDto.from(postV5);
//    }
//
//    public List<PostListResponseDto> readPosts() {
//        return postRepositoryV5.findAll().stream()
//                .map(PostListResponseDto::from)
//                .toList();
//    }
//
//    public PostWithCommentResponseDto readPostById(Long id) {
//        PostV5 postV5 = postRepositoryV5.findById(id).orElseThrow(() -> new IllegalArgumentException());
//        List<Comment> comments = commentRepository.findByPostId(id);
//        return PostWithCommentResponseDto.from(postV5, comments);
//    }
//
//    public PostWithCommentResponseDtoV2 readPostByIdV2(Long id) {
//        PostV5 postV5 = postRepositoryV5.findByIdWithComment(id).orElseThrow(() -> new IllegalArgumentException());
//        return PostWithCommentResponseDtoV2.from(postV5);
//    }
//
//
//    // 트랜잭셔널을 붙인다는것은 트랜잭션을 제대로 실행하기위함이다.
//    // 더티채킹은 계속 일어난다.
//    @Transactional
//    public PostResponseDto updatePost(Long id, PostUpdateRequestDto requestDto) {
//        PostV5 postV5 = postRepositoryV5.findById(id).orElseThrow(() -> new IllegalArgumentException());
//        postV5.update(requestDto);
//
//        return PostResponseDto.from(postV5);
//    }
//
//    @Transactional
//    public void deletePost(Long id) {
//        PostV5 postV5 = postRepositoryV5.findById(id).orElseThrow(() -> new IllegalArgumentException());
//
//        postRepositoryV5.delete(postV5);
//    }
//}
//
//
//
//
//
//
//
//
//
