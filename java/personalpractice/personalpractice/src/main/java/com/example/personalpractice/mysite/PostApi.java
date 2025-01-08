package com.example.personalpractice.mysite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostApi {
        List<Post> posts = new ArrayList<>();
        private Long id = 0L;

    @PostMapping
    public Post createPost() {

        Post post = new Post(++id, "제목", "내용");

        posts.add(post);

        return post;
    }


    {
        posts.add(new Post(++id, "기본 제목", "기본 내용"));
    }


    @GetMapping
    public List<Post> readPosts() {

        return posts;
    }

    @GetMapping("/{id}")
    public Post readPostById(@PathVariable Long id) {
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                return post;
            }
        }

        return null;
//        Long id = newPost.getId();
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        Post post = new Post();
//        post.setId(id);
//        post.setTitle("수정된 제목");
//        post.setContent(content);

    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id) {
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle("수정된 제목");
                post.setContent("수정된 내용");
                return post;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Post deletePost(@PathVariable Long id) {

        Post removePost = null;
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                removePost = post;
                break;
            }
        }
        posts.remove(removePost);
        return null;

    }

}
