package com.example.jpaproject.myuserentity;

import com.example.jpaproject.myuserentity.dto.UserUpdateRequestDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostUser extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "postuser_id")
    private Team team;

    private String username;
    private String email;
    private String nickname;
    private int age;
    private boolean isActive;

    @Builder
    public PostUser(String username, String email, String nickname, int age) {

        this.username = username;
        this.email = email;
        this.nickname = nickname;
        this.age = age;
        this.isActive = true;
    }


    public PostUser update(String username, String email, String nickname, int age) {

        this.username = username;
        this.email = email;
        this.nickname = nickname;
        this.age = age;
        this.isActive = true;

        return this;
    }

    public PostUser update(UserUpdateRequestDto requesDTto) {
        this.username = requesDTto.getUsername();
        this.email = requesDTto.getEmail();
        this.nickname = requesDTto.getNickname();
        this.age = requesDTto.getAge();
        this.isActive = requesDTto.isActive();
        return this;
    }


}
