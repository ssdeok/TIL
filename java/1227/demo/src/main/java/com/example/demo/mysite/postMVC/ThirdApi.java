package com.example.demo.mysite.postMVC;

import com.example.demo.mysite.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ThirdApi {

    List<Post> posts = new ArrayList<>();
    private Long id = 0L;

    // HTTP Request에 대한 부분
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody Post newPost){
//        title = 입력받은 title
//        content = 입력받은 content

        System.out.println(newPost.getTitle());
        System.out.println(newPost.getContent());

        String title = newPost.getTitle();
        String content = newPost.getContent();

        // 비즈니스 로직을 처리하는 부분
        
        if (title == null || title.isBlank()){
            throw new RuntimeException("title을 입력해주세요");
        }

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content를 입력해주세요");
        }

        // 데이터 생성에 대한 부분
        
//        Post post = new Post(++id, "제목", "내용");
        Post post = new Post(++id, title, content);
        posts.add(post);

        return post;

    }
}
