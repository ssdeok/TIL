package com.example.relation.domain.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TennicService {
    private final TennisRepository tennisRepository;

    public Tennis createdTennis(String player, int score) {
        Tennis tennis = new Tennis();

        tennis.addPlayer(player, score);

        return tennisRepository.save(tennis);
    }
}
