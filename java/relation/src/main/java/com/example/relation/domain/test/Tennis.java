package com.example.relation.domain.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Tennis {


    @Id
    private Long id = 1L;


    private String player;
    private int score;

//    public Tennis(Long id, String player, int score) {
//        this.id = id;
//        this.player = player;
//        this.score = score;
//    }


    public void addPlayer(String player, int score) {
        this.player = player;
        this.score = score;
    }
}
