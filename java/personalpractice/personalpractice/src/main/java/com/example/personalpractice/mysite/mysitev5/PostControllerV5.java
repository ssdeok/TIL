package com.example.personalpractice.mysite.mysitev5;

import com.example.personalpractice.mysite.mysitev5.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/posts")
@RequiredArgsConstructor
public class PostControllerV5 {

    private final PostServiceV5 postServiceV5;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ApiResponse<PostResponseDto>> createPost(@RequestBody PostCreateRequestDto requestDto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ApiResponse.ok(
                                "게시글이 정상적으로 작성되었습니다.",
                                "CREATED",
                                postServiceV5.createPost(requestDto)
                        )
                );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<PostListResponseDto>>> readPosts() {
        List<PostListResponseDto> data = postServiceV5.readPosts();
        ApiResponse<List<PostListResponseDto>> response = ApiResponse.ok(data);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<PostWithCommentResponseDto>> readPostById(@PathVariable Long id) {

        return ResponseEntity.ok(ApiResponse.ok(postServiceV5.readPostById(id)));
    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<ApiResponse<PostWithCommentResponseDtoV2>> readPostByIdV2(@PathVariable Long id) {

        return ResponseEntity.ok(ApiResponse.ok(postServiceV5.readPostByIdV2(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<PostResponseDto>> updatePost(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto) {

        return ResponseEntity.ok(ApiResponse.ok(postServiceV5.updatePost(id, requestDto)));
    }

//    @DeleteMapping("/{id}")
////    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
//        postServiceV4.deletePost(id);
//        return ResponseEntity.noContent().build();
//    }

    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<ApiResponse<Void>> deletePost(@PathVariable Long id) {
        postServiceV5.deletePost(id);
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "게시글이 정상적으로 삭제되었습니다.",
                        "DELETED",
                        null
                )
        );
    }
}

















