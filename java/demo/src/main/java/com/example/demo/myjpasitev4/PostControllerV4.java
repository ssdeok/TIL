package com.example.demo.myjpasitev4;

import com.example.demo.myjpasitev4.dto.PostCreateRequestDto;
import com.example.demo.myjpasitev4.dto.PostListResponseDto;
import com.example.demo.myjpasitev4.dto.PostResponseDto;
import com.example.demo.myjpasitev4.dto.PostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/v4/posts")
@RequiredArgsConstructor
//@NoArgsConstructor : 기본 생성자
//@AllArgsConstructor : 모든 필드에 대한 생성자
public class PostControllerV4 {
    private final PostServiceV4 postServiceV4;

    // Post method / url / data
    @PostMapping

    public ResponseEntity<ApiResponse<PostResponseDto>> createPost(@RequestBody PostCreateRequestDto requestDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ApiResponse.ok(
                                "게시글이 정상적으로 작성되었습니다",
                       "CREATED",
                      postServiceV4.createPost(requestDto)
                                )
                        );
    }

    // Getmethod / url / 전체
    @GetMapping
    public ResponseEntity<ApiResponse<List<PostListResponseDto>>> readPosts() {
        List<PostListResponseDto> data = postServiceV4.readPosts();
        ApiResponse<List<PostListResponseDto>> response = ApiResponse.ok(postServiceV4.readPosts());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    // 여기 왜 PostResponseDto 이게 타입으로 오는지?
    public ResponseEntity<ApiResponse<PostResponseDto>> readPostById(@PathVariable Long id) {

        return ResponseEntity.ok(ApiResponse.ok(postServiceV4.readPostById(id)));
    }

    // PUT id 제목/내용 dto data
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<PostResponseDto>> updatePost(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto) {
        return ResponseEntity.ok(ApiResponse.ok(postServiceV4.updatePost(id, requestDto)));
    }

//    @DeleteMapping("/{id}")

    /// /    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
//        postServiceV4.deletePost(id);
//        return ResponseEntity.noContent().build();
//    }

    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<ApiResponse<Void>> deletePost(@PathVariable Long id) {
        postServiceV4.deletePost(id);
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "게시글이 정상적으로 삭제되었습니다",
                        "DELETED",
                        null
                )
        );
    }
}

