package com.example.personalpractice.mysite.mysitev4;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepositoryV4 extends JpaRepository<PostV4, Long> {

}
