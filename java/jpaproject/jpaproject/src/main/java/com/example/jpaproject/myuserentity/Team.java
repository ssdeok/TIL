package com.example.jpaproject.myuserentity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PostUser> postUsers = new ArrayList<>();

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void addUser(PostUser user) {
        this.postUsers.add(user);
        user.setTeam(this);
    }
}
