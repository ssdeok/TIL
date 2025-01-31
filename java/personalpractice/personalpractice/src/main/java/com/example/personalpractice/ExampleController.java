package com.example.personalpractice;

import com.example.personalpractice.mysite.mysitev5.PostRepositoryV5;
import com.example.personalpractice.mysite.mysitev5.PostV5;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
@RequiredArgsConstructor
public class ExampleController {

    private final PostRepositoryV5 postRepositoryV5;

    @GetMapping("/basic/{postId}")
    public void LoadingExample1(@PathVariable Long postId) {
        PostV5 postV5 = postRepositoryV5.findById(postId)
                .orElseThrow();
        int commentSize = postV5.getComments().size();
    }

    @GetMapping("/fetch/{postId}")
    public void LoadingExample2(@PathVariable Long postId){
        PostV5 postV5 = postRepositoryV5.findByIdWithCommentFetch(postId).orElseThrow();
        int commentSize = postV5.getComments().size();
    }
}
