package com.example.demo.mysite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v3/posts")
public class PostApi3 {
    // Post class의 instance, 즉 게시글을 넣을
    // List를 생성
    List<Post> posts = new ArrayList<>();
    private Long id = 0L; // 게시글 생성에서 id 생성을 위한 장치


    {
        // 인스턴스가 생성되었을 때 한번 실행된다.
        // 초기값을 넣을 때 사용된다.
        posts.add(new Post(++id, "초기 제목", "초기 내용"));
    }

    @PostMapping
    public Post createPost(){
        Post post = new Post(++id, "제목", "내용");
        posts.add(post);

        return post;

    }


    @GetMapping
    public List<Post> readPosts(){
        return posts;
    }

    // read - 단일 조회
    @GetMapping("/{id}")
    public Post readPostById(@PathVariable Long id){
        // posts에서 post를 가져오자.

        for (Post post : posts) {
            if (post.getId().equals(id)){
                return post;
            }
        }
        return null;
    }


    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id) {
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle("수정된 제목");
                post.setContent("수정된 내용");
                return post;
            }
        }
        return null;

    }

    @DeleteMapping("/{id}")
    public Post deletePost(@PathVariable Long id) {
        Post removedPost = null;
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                removedPost = post;
                break;
            }
        }
        posts.remove(removedPost);
        return null;
    }

}
