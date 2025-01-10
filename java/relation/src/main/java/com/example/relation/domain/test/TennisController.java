package com.example.relation.domain.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tennis")
@RequiredArgsConstructor
public class TennisController {
    private final TennicService tennicService;

    @PostMapping
    public Tennis createdTennis(@RequestBody String player, @RequestBody int score) {

        return tennicService.createdTennis(player, score);

    }




}
