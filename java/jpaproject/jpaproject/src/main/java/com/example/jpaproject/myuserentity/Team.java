package com.example.jpaproject.myuserentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "team")
    private List<PostUser> postUsers = new ArrayList<>();
}
