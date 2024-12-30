package com.example.demo.myjpasite;

import com.example.demo.mysite.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceJpa {

    private final PostRepositoryJpa postRepositoryJpa;

    public PostServiceJpa(PostRepositoryJpa postRepositoryJpa) {
        this.postRepositoryJpa = postRepositoryJpa;
    }

    public PostJpa createPost(PostJpa post){
        return postRepositoryJpa.save(post);
    }

    public List<PostJpa> readPost() {
        return postRepositoryJpa.findAll();
    }

    public PostJpa readPostById(Long id) {
        return postRepositoryJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 Post입니다."));
    }

    public PostJpa updatedPost(Long id, PostJpa updatedPost) {
        // 수정할 post를 찾아야 합니다.
        PostJpa post = postRepositoryJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 Post입니다."));

        String title = updatedPost.getTitle();
        String content = updatedPost.getContent();

//        post.update(title, content);
//        postRepositoryJpa.save(post);

        // post일때 가능한 코드, void일때 불가
      return postRepositoryJpa.save(post.update(title, content));
    }
}
