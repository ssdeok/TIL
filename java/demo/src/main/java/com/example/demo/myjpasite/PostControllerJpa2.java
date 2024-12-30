package com.example.demo.myjpasite;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/posts2")
public class PostControllerJpa2 {
    private final PostServiceJpa2 postServiceJpa2;

    public PostControllerJpa2(PostServiceJpa2 postServiceJpa2) {
        this.postServiceJpa2 = postServiceJpa2;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostJpa2 createPost(@RequestBody PostJpa2 newPost) {
        return postServiceJpa2.createPost(newPost);
    }

    @GetMapping
    public List<PostJpa2> readPosts() {
        return postServiceJpa2.readPosts();
    }

    @GetMapping("/{id}")
    public PostJpa2 readPostById(@PathVariable Long id) {
        return postServiceJpa2.readPostById(id);
    }

    @PutMapping("/{id}")
    public PostJpa2 updatePost(@PathVariable Long id, @RequestBody PostJpa2 updatedPost) {
        return postServiceJpa2.updatePost(id, updatedPost);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable Long id) {
        postServiceJpa2.deletePost(id);
    }
}
