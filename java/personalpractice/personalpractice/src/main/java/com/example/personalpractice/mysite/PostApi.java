//package com.example.personalpractice.mysite;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/posts")
//public class PostApi {
//        List<Post> posts = new ArrayList<>();
//        private Long id = 0L;
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Post createPost(@RequestBody Post newPost) {
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        if (title == null || title.isBlank()) {
//            throw new RuntimeException("title을 입력하시오.");
//        }
//
//        if (content == null || content.isBlank()) {
//            throw new IllegalArgumentException("content를 입력하시오.");
//        }
//
//        Post post = new Post(++id, title, content);
//        posts.add(post);
//        return post;
//    }
//
//
//    {
//        posts.add(new Post(++id, "기본 제목", "기본 내용"));
//    }
//
//
//    @GetMapping
//    public List<Post> readPosts() {
//
//        return posts;
//    }
//
//    @GetMapping("/{id}")
//    public Post readPostById(@PathVariable Long id) {
//        for (Post post : posts) {
//            if (post.getId().equals(id)) {
//                return post;
//            }
//        }
//
//        return null;
////        Long id = newPost.getId();
////        String title = newPost.getTitle();
////        String content = newPost.getContent();
////
////        Post post = new Post();
////        post.setId(id);
////        post.setTitle("수정된 제목");
////        post.setContent(content);
//
//    }
//
//    @PutMapping("/{id}")
//    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
//
//        String newtitle = updatedPost.getTitle();
//        String newContent = updatedPost.getContent();
//
//        if (newtitle == null || newtitle.isBlank()) {
//            throw new RuntimeException("title을 입력하시오");
//        }
//
//        if (newContent == null || newContent.isBlank()) {
//            throw new IllegalArgumentException("content를 입력하시오");
//        }
//
//        for (Post post : posts) {
//            if (post.getId().equals(id)) {
//                post.setTitle(newtitle);
//                post.setContent(newContent);
//                return post;
//            }
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public Post deletePost(@PathVariable Long id) {
//
//        Post removePost = null;
//        for (Post post : posts) {
//            if (post.getId().equals(id)) {
//                removePost = post;
//                break;
//            }
//        }
//        posts.remove(removePost);
//        return null;
//
//    }
//
//}
