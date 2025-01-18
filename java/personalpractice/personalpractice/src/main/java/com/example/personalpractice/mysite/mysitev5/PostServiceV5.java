package com.example.personalpractice.mysite.mysitev5;

import com.example.personalpractice.mysite.mysitev5.dto.PostCreateRequestDto;
import com.example.personalpractice.mysite.mysitev5.dto.PostListResponseDto;
import com.example.personalpractice.mysite.mysitev5.dto.PostResponseDto;
import com.example.personalpractice.mysite.mysitev5.dto.PostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostServiceV5 {
    private final PostRepositoryV5 postRepositoryV5;


    @Transactional
    public PostResponseDto createPost(PostCreateRequestDto requestDto) {
        PostV5 postV5 = postRepositoryV5.save(requestDto.toEntity());
        return PostResponseDto.from(postV5);
    }

    public List<PostListResponseDto> readPosts() {
        return postRepositoryV5.findAll().stream()
                .map(PostListResponseDto::from)
                .toList();
    }

    public PostResponseDto readPostById(Long id) {
        PostV5 postV5 = postRepositoryV5.findById(id).orElseThrow(() -> new IllegalArgumentException());
        return PostResponseDto.from(postV5);
    }

    // 트랜잭셔널을 붙인다는것은 트랜잭션을 제대로 실행하기위함이다.
    // 더티채킹은 계속 일어난다.
    @Transactional
    public PostResponseDto updatePost(Long id, PostUpdateRequestDto requestDto) {
        PostV5 postV5 = postRepositoryV5.findById(id).orElseThrow(() -> new IllegalArgumentException());
        postV5.update(requestDto);

        return PostResponseDto.from(postV5);
    }

    @Transactional
    public void deletePost(Long id) {
        PostV5 postV5 = postRepositoryV5.findById(id).orElseThrow(() -> new IllegalArgumentException());

        postRepositoryV5.delete(postV5);
    }
}









