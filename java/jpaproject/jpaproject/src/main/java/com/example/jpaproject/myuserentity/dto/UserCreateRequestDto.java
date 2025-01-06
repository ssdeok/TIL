package com.example.jpaproject.myuserentity.dto;

import com.example.jpaproject.myuserentity.PostUser;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Getter
@NoArgsConstructor
public class UserCreateRequestDto {

    @NotBlank
    @Length(min = 3, max = 20)
    @Column(unique = true, updatable = false)
    private String username;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    @Length(min = 2, max = 10)
    private String nickname;

    @Range(min = 0, max = 150)
    private int age;


    private boolean isActive = true;


    public PostUser toEntity() {
        return PostUser.builder()
                .username(this.username)
                .email(this.email)
                .nickname(this.nickname)
                .age(this.age)
//                .isActive(this.isActive)
                .build();

    }

}
