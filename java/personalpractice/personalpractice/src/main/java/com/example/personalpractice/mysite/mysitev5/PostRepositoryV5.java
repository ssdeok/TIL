package com.example.personalpractice.mysite.mysitev5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PostRepositoryV5 extends JpaRepository<PostV5, Long> {

    @Query("SELECT p FROM PostV5 p LEFT JOIN p.comments WHERE p.id = :id")
    Optional<PostV5> findByIdWithComment(@Param("id") Long id);

    @Query("SELECT p FROM Post p LEFT JOIN FETCH  p.comments WHERE p.id = :id")
    Optional<PostV5> findByIdWithCommentFetch(@Param("id") Long id);
}
