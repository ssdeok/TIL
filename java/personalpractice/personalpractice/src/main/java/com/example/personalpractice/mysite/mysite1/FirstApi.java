package com.example.personalpractice.mysite.mysite1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi {

    @GetMapping("/")
    public String mainPage() {
        return "Hello Spring";
    }

}
