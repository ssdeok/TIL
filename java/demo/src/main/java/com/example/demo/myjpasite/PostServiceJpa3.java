package com.example.demo.myjpasite;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceJpa3 {
    private final PostRepositoryJpa3 postRepositoryJpa3;

    public PostServiceJpa3(PostRepositoryJpa3 postRepositoryJpa3) {
        this.postRepositoryJpa3 = postRepositoryJpa3;

    }

    public PostJpa3 createPost(PostJpa3 postJpa3) {
        return postRepositoryJpa3.save(postJpa3);
    }

    public List<PostJpa3> readPosts() {
        return postRepositoryJpa3.findAll();
    }

    public PostJpa3 readPostById(Long id) {
        return postRepositoryJpa3.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));

    }

    public PostJpa3 updatePost(Long id, PostJpa3 updatedPost) {
        PostJpa3 postJpa3 = postRepositoryJpa3.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));

        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        postJpa3.update(newTitle, newContent);

        return postRepositoryJpa3.save(postJpa3);
    }

    public void deletePost(Long id) {
        PostJpa3 postJpa3 = postRepositoryJpa3.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
        postRepositoryJpa3.delete(postJpa3);
    }
}
