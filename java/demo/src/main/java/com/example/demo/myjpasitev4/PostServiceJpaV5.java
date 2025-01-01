package com.example.demo.myjpasitev4;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostServiceJpaV5 {
    private final PostRepositoryJpaV5 postRepositoryJpaV5;

    public PostJpaV5 createPost(PostJpaV5 post) {
        return postRepositoryJpaV5.save(post);
    }


}
