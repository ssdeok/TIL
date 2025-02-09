package com.example.secondpersonalprac.mysite;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostApi {
    List<Post> posts = new ArrayList<>();
    private Long id = 0L;

}
