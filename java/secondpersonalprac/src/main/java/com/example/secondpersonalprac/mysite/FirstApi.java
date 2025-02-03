package com.example.secondpersonalprac.mysite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi {

    @GetMapping("/hello")
    public String mainPage() {
        return "Hello User";
    }
}
