package com.example.personalpractice.mysite;

import com.example.personalpractice.mysite.mysitev3.PostServiceV3;
import com.example.personalpractice.mysite.mysitev3.PostV3;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/posts")
@RequiredArgsConstructor
public class PostController {
    // DI
    private final PostServiceV3 postServicev3;

//    public PostController(PostService postService) {
//        this.postService = postService;
//    }

    //    private PostService postService = new PostService();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostV3 createPost(@RequestBody PostV3 newPost) {
        return postServicev3.createPost(newPost);
    }

    @GetMapping
    public List<PostV3> readPosts() {
        return postServicev3.readPosts();
    }

    @GetMapping("/{id}")
    public PostV3 readPostById(@PathVariable Long id) {
        return postServicev3.readPostById(id);
    }

    @PutMapping("/{id}")
    public PostV3 updatedPost(@PathVariable Long id, @RequestBody PostV3 updatedPost) {
        return postServicev3.updatePost(id, updatedPost);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable Long id) {
        postServicev3.deletePost(id);
    }
}
