package com.example.demo.mysite.postMVC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondApi {

    @GetMapping("/main")
    public String mainpage() {
        return "Hello Spring";
    }
    @GetMapping("/secondhello")
    public String hellowPage() {
        return "Hello User";
    }
}
