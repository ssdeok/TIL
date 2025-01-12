package com.example.personalpractice.mysite.mysitev3;

import com.example.personalpractice.mysite.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostServiceV3 {
    private final PostRepositoryV3 postRepositoryv3;

    @Transactional
    public PostV3 createPost(PostV3 post) {
        return postRepositoryv3.save(post);

    }

    public List<PostV3> readPosts() {
        return postRepositoryv3.findAll();
    }

    public PostV3 readPostById(Long id) {
        return postRepositoryv3.findById(id);
    }

    @Transactional
    public PostV3 updatePost(Long id, PostV3 updatedPost) {
        return postRepositoryv3.update(id, updatedPost);
    }

    @Transactional
    public void deletePost(Long id) {
        postRepositoryv3.delete(id);
    }
}









