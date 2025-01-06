package com.example.jpaproject.myuserentity;

import com.example.jpaproject.myuserentity.dto.UserCreateRequestDto;
import com.example.jpaproject.myuserentity.dto.UserListResponseDto;
import com.example.jpaproject.myuserentity.dto.UserResponseDto;
import com.example.jpaproject.myuserentity.dto.UserUpdateRequestDto;
import com.example.jpaproject.myuserentity.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/posts")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ApiResponse<Void>> handleResourceNotFound(ResourceNotFoundException ex) {
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(ApiResponse.error("resoure not found", "NOT_FOUND"));
//        // .body(ApiResponse.error(ex.getMessage(), "NOT_FOUND"));
//    }


    @PostMapping
    public ResponseEntity<ApiResponse<UserResponseDto>> createPost(@Valid @RequestBody UserCreateRequestDto requestDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ApiResponse.ok("게시글이 성공적으로 작성되었습니다", "CREATED",
                                userService.createPost(requestDto)
                        )
                );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<UserListResponseDto>>> readPosts() {
        List<UserListResponseDto> data = userService.readPosts();
        ApiResponse<List<UserListResponseDto>> response = ApiResponse.ok(userService.readPosts());

        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponseDto>> readPostById(@PathVariable Long id) {
//        ApiResponse<UserResponseDto> response = ApiResponse.ok(userService.readPostById(id));
        return ResponseEntity.ok(ApiResponse.ok(userService.readPostById(id)));

    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponseDto>> updatePost(@PathVariable Long id, @RequestBody UserUpdateRequestDto requestDto) {
//        ApiResponse<UserResponseDto> response = ApiResponse.ok("게시글이 성공적으로 수정되었습니다", "UPDATED", userService.updatePost(id, requestDto));

        return ResponseEntity.ok(ApiResponse.ok(userService.updatePost(id, requestDto)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deletePost(@PathVariable Long id) {
        userService.deletePost(id);
//        ApiResponse<Void> response = ApiResponse.ok("게시글이 성공적으로 삭제되었습니다", "DELETED", null);
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "게시글이 정상적으로 삭제되었습니다",
                        "DELETED",
                        null
                ));
    }
}
