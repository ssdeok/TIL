package com.example.personalpractice.mysite.mysitev2;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/v2/posts")
@RequiredArgsConstructor
public class PostControllerV2 {
    // DI
    private final PostServiceV2 postServiceV2;

//    public PostControllerV2(PostServiceV2 postServiceV2) {
//        this.postServiceV2 = postServiceV2;
//    }

    //    private PostService postService = new PostService();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostV2 createPost(@RequestBody PostV2 newPostV2) {
        return postServiceV2.createPost(newPostV2);
    }

    @GetMapping
    public List<PostV2> readPosts() {
        return postServiceV2.readPosts();
    }

    @GetMapping("/{id}")
    public PostV2 readPostById(@PathVariable Long id) {
        return postServiceV2.readPostById(id);
    }

    @PutMapping("/{id}")
    public PostV2 updatedPost(@PathVariable Long id, @RequestBody PostV2 updatedPostV2) {
        return postServiceV2.updatePost(id, updatedPostV2);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable Long id) {
        postServiceV2.deletePost(id);
    }
}
