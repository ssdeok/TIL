package com.example.demo.myjpasitev4;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostServiceJpaV4 {
    private final PostRepositoryJpaV4 postRepositoryJpaV4;

    public PostJpaV4 createPost(PostJpaV4 post) {
        return postRepositoryJpaV4.save(post);
    }
}
