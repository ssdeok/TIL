//package com.example.demo.myjpasite;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/jpa/posts3")
//public class PostControllerJpa3 {
//    private final PostServiceJpa3 postServiceJpa3;
//
//    public PostControllerJpa3(PostServiceJpa3 postServiceJpa3) {
//        this.postServiceJpa3 = postServiceJpa3;
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public PostJpa3 createPost(@RequestBody PostJpa3 newPost) {
//        return postServiceJpa3.createPost(newPost);
//    }
//
//    @GetMapping
//    public List<PostJpa3> readPosts() {
//        return postServiceJpa3.readPosts();
//    }
//
//    @GetMapping
//    public PostJpa3 readPostById(@PathVariable Long id) {
//        return postServiceJpa3.readPostById(id);
//    }
//
//    @PutMapping("/{id}")
//    public PostJpa3 updatePost(@PathVariable Long id, @RequestBody PostJpa3 updatedPost) {
//        return postServiceJpa3.updatePost(id, updatedPost);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deletePost(@PathVariable Long id) {
//
//        postServiceJpa3.deletePost(id);
//    }
//}
