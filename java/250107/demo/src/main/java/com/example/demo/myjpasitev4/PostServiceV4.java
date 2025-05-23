package com.example.demo.myjpasitev4;

import com.example.demo.myjpasitev4.dto.PostCreateRequestDto;
import com.example.demo.myjpasitev4.dto.PostListResponseDto;
import com.example.demo.myjpasitev4.dto.PostResponseDto;
import com.example.demo.myjpasitev4.dto.PostUpdateRequestDto;
import com.example.demo.myjpasitev4.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostServiceV4 {
    private final PostRepositoryV4 postRepositoryV4;

    @Transactional
    public PostResponseDto createPost(PostCreateRequestDto requestDto){
        
//        PostV4 transientPost = requestDto.toEntity();
//        PostV4 managedPost =  postRepositoryV4.save(transientPost);

        requestDto.getAuthor();
        if (postRepositoryV4.extsitsbyauthor(requestDto.getAuthor())){
            thorow new DuplicateUsernameExceiptoin
        }
        PostV4 post =  postRepositoryV4.save(requestDto.toEntity());

        return PostResponseDto.from(post);
//        return new PostResponseDto(post.getId(), post.getTitle(), post.getContent(), post.getAuthor());
    }
    
    public List<PostListResponseDto> readPosts(){
        return postRepositoryV4.findAll().stream()
                .map(PostListResponseDto::from)
                .toList();
//                .map((post) -> PostListResponseDto.from(post))
    }

    public PostResponseDto readPostById(Long id){
        PostV4 post = postRepositoryV4.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        return PostResponseDto.from(post);
    }

    @Transactional
    public PostResponseDto updatePost(Long id, PostUpdateRequestDto requestDto){
//                하나 가져오자 -> 걔를 수정하자 -> save하자
        PostV4 post = postRepositoryV4.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());
        post.update(requestDto);
        return PostResponseDto.from(post);
    }

    @Transactional()
    public void deletePost(Long id){
        // 하나 가져오자 -> 걔를 삭제하자.
        PostV4 post = postRepositoryV4.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());

        postRepositoryV4.delete(post);
    }
}
