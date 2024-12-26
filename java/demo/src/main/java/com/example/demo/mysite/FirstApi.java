package com.example.demo.mysite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi {
    // 요청을 받아 응답하는녀석으로 만들거임

    @GetMapping("/")
    public String magePage() {
        return "hello spring";
    }

    @GetMapping("/hello")
    public String hellopage() {
        return "Hello User";
    }
}
