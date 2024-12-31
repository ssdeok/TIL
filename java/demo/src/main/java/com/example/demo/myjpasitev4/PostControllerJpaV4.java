package com.example.demo.myjpasitev4;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa/v4/posts")
@RequiredArgsConstructor
public class PostControllerJpaV4 {
    private final PostServiceJpaV4 postServiceJpaV4;

    @PostMapping
    public PostJpaV4 createPost(@RequestBody PostJpaV4 newPost) {
        return postServiceJpaV4.createPost(newPost);
    }
}
