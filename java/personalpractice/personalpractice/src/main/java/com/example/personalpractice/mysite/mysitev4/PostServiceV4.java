package com.example.personalpractice.mysite.mysitev4;

import com.example.personalpractice.mysite.mysitev4.dto.PostCreateRequestDto;
import com.example.personalpractice.mysite.mysitev4.dto.PostListResponseDto;
import com.example.personalpractice.mysite.mysitev4.dto.PostResponseDto;
import com.example.personalpractice.mysite.mysitev4.dto.PostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostServiceV4 {
    private final PostRepositoryV4 postRepositoryV4;


    @Transactional
    public PostResponseDto createPost(PostCreateRequestDto requestDto) {
        PostV4 postV4 = postRepositoryV4.save(requestDto.toEntity());
        return PostResponseDto.from(postV4);
    }

    public List<PostListResponseDto> readPosts() {
        return postRepositoryV4.findAll().stream()
                .map(PostListResponseDto::from)
                .toList();
    }

    public PostResponseDto readPostById(Long id) {
        PostV4 postV4 = postRepositoryV4.findById(id).orElseThrow(() -> new IllegalArgumentException());
        return PostResponseDto.from(postV4);
    }

    // 트랜잭셔널을 붙인다는것은 트랜잭션을 제대로 실행하기위함이다.
    // 더티채킹은 계속 일어난다.
    @Transactional
    public PostResponseDto updatePost(Long id, PostUpdateRequestDto requestDto) {
        PostV4 postV4 = postRepositoryV4.findById(id).orElseThrow(() -> new IllegalArgumentException());
        postV4.update(requestDto);

        return PostResponseDto.from(postV4);
    }

    @Transactional
    public void deletePost(Long id) {
        PostV4 postV4 = postRepositoryV4.findById(id).orElseThrow(() -> new IllegalArgumentException());

        postRepositoryV4.delete(postV4);
    }
}









