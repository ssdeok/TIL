<<<<<<< HEAD
//package com.example.personalpractice.mysite.mysitev5.comment;
//
//import com.example.personalpractice.mysite.mysitev4.ApiResponse;
//import com.example.personalpractice.mysite.mysitev5.dto.CommentRequestDto;
//import com.example.personalpractice.mysite.mysitev5.dto.CommentResponseDto;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/posts/{postId}/comments")
//@RequiredArgsConstructor
//public class CommentController {
//    private final CommentService commentService;
//
//    @PostMapping
//    public ResponseEntity<ApiResponse<CommentResponseDto>> createComment(
//            @PathVariable Long postId, @Valid @RequestBody CommentRequestDto requestDto
//    ) {
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(
//                        ApiResponse.ok("댓글이 성공적으로 작성되었습니다",
//                                "CREATED",
//                                commentService.createComment(postId,requestDto))
//                );
//    }
//}
=======
package com.example.personalpractice.mysite.mysitev5.comment;

import com.example.personalpractice.mysite.mysitev4.ApiResponse;
import com.example.personalpractice.mysite.mysitev5.dto.CommentRequestDto;
import com.example.personalpractice.mysite.mysitev5.dto.CommentResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts/{postId}/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<ApiResponse<CommentResponseDto>> createComment(
            @PathVariable Long postId, @Valid @RequestBody CommentRequestDto requestDto
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ApiResponse.ok("댓글이 성공적으로 작성되었습니다",
                                "CREATED",
                                commentService.createComment(postId,requestDto))
                );
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<ApiResponse<CommentResponseDto>> update(
            @PathVariable Long postId, @PathVariable Long commentId, @Valid @RequestBody CommentRequestDto requestDto
    ) {
        return ResponseEntity.ok(ApiResponse.ok(commentService.updateComment(postId, commentId, requestDto)));
    }
}
>>>>>>> 2f287f7f192eb5f57a93c021c47ffa1b20e07f49
