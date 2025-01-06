package com.example.demo.myjpasite;

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

    public List<PostJpa> readPosts(){
        return postRepositoryJpa.findAll();
    }

    public PostJpa readPostById(Long id){
        return postRepositoryJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 Post입니다"));

    }

    public PostJpa updatePost(Long id, PostJpa updatedPost){
        // 수정할 post를 찾아야 합니다.
        PostJpa post = postRepositoryJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 Post입니다"));

        String title = updatedPost.getTitle();
        String content = updatedPost.getContent();


//        post.update(title, content);
//        postRepositoryJpa.save(post);

        return postRepositoryJpa.save(post.update(title, content));

    }

    public void deletePost(Long id){
        PostJpa post = postRepositoryJpa.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
        postRepositoryJpa.delete(post);
    }

}
