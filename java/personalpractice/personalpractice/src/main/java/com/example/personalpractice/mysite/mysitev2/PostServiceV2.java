package com.example.personalpractice.mysite.mysitev2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostServiceV2 {

    private final PostRepositoryV2 postRepositoryV2;

//    public PostServiceV2(PostRepositoryV2 postRepositoryV2) {
//        this.postRepositoryV2 = postRepositoryV2;
//    }
    //    private PostRepository postRepository = new PostRepository();


    @PostMapping
    public PostV2 createPost(PostV2 postV2) {
        return postRepositoryV2.save(postV2);
    }
//    public Post createPost(Post newPost) {
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        if (title == null || title.isBlank()){
//            throw new RuntimeException("title을 입력하시오.");
//        }
//
//        if (content == null || content.isBlank()) {
//            throw new IllegalArgumentException("content를 입력하시오.");
//        }
//
//        return postRepository.save(newPost);
//    }

    @GetMapping
    public List<PostV2> readPosts() {
        return postRepositoryV2.findAll();
    }
//
    @GetMapping("/{id}")
    public PostV2 readPostById(@PathVariable Long id) {
        return postRepositoryV2.findById(id);
//                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
//        Post post = postRepository.findById(id);
//        if (post == null) {
//            throw new IllegalArgumentException("없는 id입니다.");
//        }
//        return post;
    }

    public PostV2 updatePost(Long id, PostV2 updatedPostV2) {
//
//        PostV2 postV2 = postRepositoryV2.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
//
//        String newTitle = updatedPostV2.getTitle();
//        String newContent = updatedPostV2.getContent();
//
//        postV2.update(newTitle, newContent);
//
//        return postRepositoryV2.save(postV2);

//        Post post = postRepository.findById(id);
//
//        if (post == null) {
//            throw new IllegalArgumentException("없는 id입니다");
//        }
//
//        String newTitle = updatedPost.getTitle();
//        String newContent = updatedPost.getContent();
//
//        if (newTitle == null || newTitle.isBlank()){
//            throw new RuntimeException("title을 입력하시오.");
//        }
//
//        if (newContent == null || newContent.isBlank()) {
//            throw new IllegalArgumentException("content를 입력하시오.");
//        }
//
        return postRepositoryV2.update(id, updatedPostV2);

    }

    public void deletePost(Long id) {
//        PostV2 postV2 = postRepositoryV2.findById(id);
//        if (postV2 == null) {
//            throw new IllegalArgumentException("없는 id입니다");
//        }
        postRepositoryV2.delete(id);
    }
}















