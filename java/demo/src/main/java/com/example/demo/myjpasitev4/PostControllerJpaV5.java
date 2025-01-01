package com.example.demo.myjpasitev4;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa/v5/posts")
@RequiredArgsConstructor
public class PostControllerJpaV5 {
    private final PostServiceJpaV5 postServiceJpaV5;

    @PostMapping
    public PostJpaV5 createPost(@RequestBody PostJpaV5 newPost) {
        return postServiceJpaV5.createPost(newPost);
    }

}
