package com.example.demo.mysite.postMVC;

import com.example.demo.mysite.Post;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private List<Post> posts = new ArrayList<>();
    private Long id = 0L;


    // 저장. create 그 자체.
    public Post save(Post newPost){
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        Post post = new Post(++id, title, content);

        Post post = new Post(++id, newPost.getTitle(), newPost.getContent());
        posts.add(post);
        return post;
    }

    public List<Post> findAll(){
        return posts;
    }

    public Post findById(Long id){
        for (Post post : posts) {
            if (post.getId().equals(id)){
                return post;
            }
        }
        return null;
    }

    public Post modify(Long id, Post updatedPost) {
        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle(newTitle);
                post.setContent(newContent);
                return post;
            }
        }
        return null;
    }

    public void delete(Post post) {
        posts.remove(post);
    }

}
