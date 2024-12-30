package com.example.demo.myjpasite;

import com.example.demo.mysite.postMVC.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/posts")
public class PostControllerJpa {
    private final PostServiceJpa postServiceJpa;

    public PostControllerJpa(PostServiceJpa postServiceJpa) {
        this.postServiceJpa = postServiceJpa;
    }

    @PostMapping
    public PostJpa createPost(@RequestBody PostJpa newPost) {
        return postServiceJpa.createPost(newPost);
    }

    @GetMapping
    public List<PostJpa> readPost() {
        return postServiceJpa.readPost();
    }

    @GetMapping("/{id}")
    public PostJpa readPostById(@PathVariable Long id) {
        return postServiceJpa.readPostById(id);
    }

    @PutMapping("/{id}")
    public PostJpa updatePost(@PathVariable Long id, @RequestBody PostJpa updatedPost) {
        return postServiceJpa.updatedPost(id, updatedPost);
    }
}
