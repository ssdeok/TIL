package com.example.demo.myjpasitev5;

import com.example.demo.myjpasitev3.PostJpaV3;
import com.example.demo.myjpasitev3.PostRepositoryJpaV3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostServiceJpaV5 {
    private final PostRepositoryJpaV3 postRepositoryJpaV3;

    @Transactional
    public com.example.demo.myjpasitev3.PostJpaV3 createPost(com.example.demo.myjpasitev3.PostJpaV3 post) {
        return postRepositoryJpaV3.save(post);
    }

    public List<com.example.demo.myjpasitev3.PostJpaV3> readPosts() {
        return postRepositoryJpaV3.findAll();
    }

    public com.example.demo.myjpasitev3.PostJpaV3 readPostById(Long id) {
        return postRepositoryJpaV3.findById(id);
    }

    @Transactional
    public com.example.demo.myjpasitev3.PostJpaV3 updatePost(Long id, PostJpaV3 updatedPost) {
        return postRepositoryJpaV3.update(id, updatedPost);
    }

    @Transactional
    public void deletePost(Long id) {
        postRepositoryJpaV3.delete(id);
    }

}
