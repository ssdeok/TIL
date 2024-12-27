package com.example.demo.mysite;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v4/posts")
public class PostApi4 {
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
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
                            // 입력받은 데이터를 너가 갖고있어, 이 느낌
   public Post createPost(@RequestBody Post newPost) {
//           title = 입력받은 title
//           content = 입력받은 content
        System.out.println(newPost.getTitle());
        System.out.println(newPost.getContent());

        String title = newPost.getTitle();
        String content = newPost.getContent();

//        title.trim().isBlank()
        if (title == null || title.isBlank()) {
            throw new RuntimeException("title을 입력해주세요");
        }

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content를 입력해주세요");
        }

        Post post = new Post(++id, title, content);
//       Post post = new Post(++id, "제목", "내용");
        posts.add(post);

        // 리턴을 post로 하기때문에 마지막에 생성된것만 보임. id가 지금 10이면 1~9는 안보이지만 있는거임
        return post;

    }

    // read - 전체 조회
    // posts / get /
    @GetMapping
    public List<Post> readPosts() {
        // 내 게시글들을 리턴한다. 여러개면 여러개 조회.
        return posts;
    }

    // read - 단일 조회
    @GetMapping("/{id}")
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

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {

        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        if (newTitle == null || newTitle.isBlank()) {
            throw new RuntimeException("title을 입력하시오.");
        }

        if (newContent == null || newContent.isBlank()) {
            throw new IllegalArgumentException("content를 입력하시오.");
        }

        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle(newTitle);
                post.setContent(newContent);
                return post;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
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

    @GetMapping("/paged") // "/paged?key=value&key=value"
        public List<Post> getPagedPosts(
                @RequestParam(defaultValue = "1") int page,
                @RequestParam(defaultValue = "10") int size


    ){

            // 1. 페이지네이션을 위한 더미데이터 추가
            for (int i = 1; i <= 20; i++) {
                String title = "제목 " + i;
                String content = "내용 " + i;
                Post post = new Post(++id, title, content);
                posts.add(post);
            }

            // 2. 시작 인덱스와 끝 인덱스 계산
            int startIndex = (page - 1) * size;
            int endIndex = Math.min(startIndex + size, posts.size());

            // 3. 페이지에 해당하는 데이터만 추출
            return posts.subList(startIndex, endIndex);
        }
//
//        System.out.println(key);
//
//        return posts;
//    }

}






















