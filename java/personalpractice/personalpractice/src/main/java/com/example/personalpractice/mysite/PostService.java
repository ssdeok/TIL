package com.example.personalpractice.mysite;

import java.util.List;

public class PostService {

    private PostRepository postRepository = new PostRepository();

    public Post createPost(Post newPost) {
        String title = newPost.getTitle();
        String content = newPost.getContent();

        if (title == null || title.isBlank()){
            throw new RuntimeException("title을 입력하시오.");
        }

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content를 입력하시오.");
        }

        return postRepository.save(newPost);
    }

    public List<Post> readPosts() {
        return postRepository.findAll();
    }

    public Post readPostById(Long id) {
        Post post = postRepository.findById(id);
        if (post == null) {
            throw new IllegalArgumentException("없는 id입니다.");
        }
        return post;
    }

    public Post updatePost(Long id, Post updatedPost) {
        Post post = postRepository.findById(id);

        if (post == null) {
            throw new IllegalArgumentException("없는 id입니다");
        }

        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        if (newTitle == null || newTitle.isBlank()){
            throw new RuntimeException("title을 입력하시오.");
        }

        if (newContent == null || newContent.isBlank()) {
            throw new IllegalArgumentException("content를 입력하시오.");
        }

        return postRepository.modify(id, updatedPost);

    }

    public void deletePost(Long id) {
        Post post = postRepository.findById(id);
        if (post == null) {
            throw new IllegalArgumentException("없는 id입니다");
        }
        postRepository.delete(post);
    }
}















