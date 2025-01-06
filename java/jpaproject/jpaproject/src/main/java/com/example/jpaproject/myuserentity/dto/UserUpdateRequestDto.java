package com.example.jpaproject.myuserentity.dto;

import lombok.Getter;

@Getter
public class UserUpdateRequestDto {

    private String username;
    private String email;
    private String nickname;
    private int age;
    private boolean isActive;
}
