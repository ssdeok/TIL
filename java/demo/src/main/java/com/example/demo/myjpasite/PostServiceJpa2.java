package com.example.demo.myjpasite;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceJpa2 {

    private final PostRepositoryJpa2 postRepository2;

    public PostServiceJpa2(PostRepositoryJpa2 postRepository2) {
        this.postRepository2 = postRepository2;
    }

    public PostJpa2 createPost(PostJpa2 postJpa2) {
        return postRepository2.save(postJpa2);
    }

    public List<PostJpa2> readPosts() {
        return postRepository2.findAll();
    }

    public PostJpa2 readPostById(Long id) {
        return postRepository2.findById(id).orElseThrow((() -> new IllegalArgumentException("id가 없습니다")));

    }

    public PostJpa2 updatePost(Long id, PostJpa2 updatedPost) {
        PostJpa2 postJpa2 = postRepository2.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다."));

        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        postJpa2.update(newTitle, newContent);

        return postRepository2.save(postJpa2);

    }

    public void deletePost(Long id) {
        PostJpa2 postJpa2 = postRepository2.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
        postRepository2.delete(postJpa2);
    }
}
