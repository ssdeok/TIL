package com.example.demo.mysite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostApi {
    // Post class의 instance, 즉 게시글을 넣을 List를 생성
    
    // ArrayList<>() <- 데이터베이스의 테이블로(엔터티) 볼것
    List<Post> posts = new ArrayList<>(); // 우리의 게시판
    private Long id = 0L; // 게시글 생성에서 id 생성을 위한 장치


    // 초기화 블록
    {
        // 인스턴스가 생성되었을 때 한 번 실행된다.
        // 초기값을 넣을 때 사용된다.
        posts.add(new Post(++id, "초기 제목", "초기 내용"));
    }

    // create
    // post / 내용 / url
    @GetMapping("/posts/create")
   public Post createPost() {
       Post post = new Post(++id, "제목", "내용");
        posts.add(post);

        // 리턴을 post로 하기때문에 마지막에 생성된것만 보임. id가 지금 10이면 1~9는 안보이지만 있는거임
        return post;

    }

    // read - 전체 조회
    // posts / get /
    @GetMapping("/posts")
    public List<Post> readPosts() {
        // 내 게시글들을 리턴한다. 여러개면 여러개 조회.
        return posts;
    }

    // read - 단일 조회
    @GetMapping("/posts/{id}")
    // 위의 id를 패스베리어블에 넣어준다
//    public Post readPostById(@PathVariable("id") Long id) // ("id") 생략해줌
    public Post readPostById(@PathVariable Long id) {
            // posts에서 post를 가져오자.

        // 모든 posts들에 대해서 반복을 돌면서 아이디와 같은걸 알려줘
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                return post;
            }
        }
        return null;
    }

    // update
    // 변경 내용 / id / url
    @GetMapping("/posts/{id}/update")
    // restful
    // "/posts/{id}" / method : PUT / PATCH
    public Post updatePost(@PathVariable Long id) {
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle("수정된 내용");
                post.setContent("수정된 내용");
                return post;
            }
        }
        return null;
    }

    // delete

    @GetMapping("/posts/{id}/delete")
    // restful
    // "/posts/{id}" method : DELETE
    public Post deletePost(@PathVariable Long id) {
        Post removePost = null;
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                removePost = post;
                break;
            }
        }
        posts.remove(removePost);
        return null;
    }
}
