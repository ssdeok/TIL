package com.example.demo.myjpasitev2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceJpaV2 {

    private final PostRepositoryJpaV2 postRepositoryJpaV2;

//    public PostServiceJpaV2(PostRepositoryJpaV2 postRepositoryJpaV2) {
//        this.postRepositoryJpaV2 = postRepositoryJpaV2;
//    }

    public PostJpaV2 createPost(PostJpaV2 post){
        return postRepositoryJpaV2.save(post);
    }
//
    public List<PostJpaV2> readPost() {
        return postRepositoryJpaV2.findAll();
    }
//
    public PostJpaV2 readPostById(Long id) {
        return postRepositoryJpaV2.findById(id);

    }

    public PostJpaV2 updatedPost(Long id, PostJpaV2 updatedPost) {
        // 수정할 post를 찾아야 합니다.
        return postRepositoryJpaV2.update(id, updatedPost);
        }

    public void deletePost(Long id) {
        postRepositoryJpaV2.delete(id);
    }
//
//        String title = updatedPost.getTitle();
//        String content = updatedPost.getContent();
//
////        post.update(title, content);
////        postRepositoryJpa.save(post);
//
//        // post일때 가능한 코드, void일때 불가
//      return postRepositoryJpaV2.save(post.update(title, content));
//    }
}
