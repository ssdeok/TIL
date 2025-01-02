package com.example.demo.mysite.postMVC;

import com.example.demo.mysite.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
//    PostRepository postRepository = new PostRepository();

    // DI
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 컨트롤러에게서 data를 입력받아서
    public Post createPost(Post newPost){

        // validation 체크를 한 후에 - 비즈니스 로직 처리. 내가 할 것 할게.
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        if (title == null || title.isBlank()){
//            throw new RuntimeException("title을 입력해주세요");
//        }
//
//        if (content == null || content.isBlank()) {
//            throw new IllegalArgumentException("content를 입력해주세요");
//        }
        validatePostData(newPost);

        // post를 생성하겠다.
        return postRepository.save(newPost);
    }

    public List<Post> readPosts(){
        return postRepository.findAll();
    }

    public Post readPostById(Long id){
        Post post = postRepository.findById(id);

//        if (post == null){
//            throw new IllegalArgumentException("없는 id입니다");
//        }
        checkPostIsNull(post);

        return post;
    }

    public Post updatePost(Long id, Post updatedPost){
        Post post = postRepository.findById(id);
//        if (post == null){
//            throw new IllegalArgumentException("없는 id입니다");
//        }
        checkPostIsNull(post);

        validatePostData(updatedPost);

        return postRepository.modify(id, updatedPost);
    }

    public void deletePost(Long id) {
        Post post = postRepository.findById(id);
        checkPostIsNull(post);

        postRepository.delete(post);
    }


    public void checkPostIsNull(Post post){
        if (post == null){
            throw new IllegalArgumentException("없는 id입니다");
        }
    }

    public void validatePostData(Post post){
        String title = post.getTitle();
        String content = post.getContent();

        if (title == null || title.isBlank()){
            throw new RuntimeException("title을 입력해주세요");
        }

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content를 입력해주세요");
        }

    }
}
