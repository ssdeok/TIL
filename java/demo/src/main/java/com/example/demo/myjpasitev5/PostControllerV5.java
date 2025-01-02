package com.example.demo.myjpasitev5;

import com.example.demo.myjpasitev4.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa/v5/posts")
@RequiredArgsConstructor
public class PostControllerV5 {
    private final PostServiceV5 postServiceV5;

    @PostMapping
    public ResponseEntity<ApiResponse<>>
}
