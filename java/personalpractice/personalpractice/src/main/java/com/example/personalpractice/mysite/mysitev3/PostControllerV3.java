package com.example.personalpractice.mysite.mysitev3;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/v3/posts")
@RequiredArgsConstructor
public class PostControllerV3 {
    // DI
    private final PostServiceV3 postServiceV3;

//    public PostControllerV2(PostServiceV2 postServiceV2) {
//        this.postServiceV2 = postServiceV2;
//    }

    //    private PostService postService = new PostService();

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public PostV3 createPost(@RequestBody PostV3 newPostV3) {
//        return postServiceV3.createPost(newPostV3);
//    }
//
//    @GetMapping
//    public List<PostV3> readPosts() {
//        return postServiceV3.readPosts();
//    }
//
//    @GetMapping("/{id}")
//    public PostV3 readPostById(@PathVariable Long id) {
//        return postServiceV3.readPostById(id);
//    }
//
//    @PutMapping("/{id}")
//    public PostV3 updatedPost(@PathVariable Long id, @RequestBody PostV3 updatedPostV3) {
//        return postServiceV3.updatePost(id, updatedPostV3);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deletePost(@PathVariable Long id) {
//        postServiceV3.deletePost(id);
//    }
}
