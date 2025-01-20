package com.example.personalpractice.mysite.mysitev5.comment;


import com.example.personalpractice.mysite.Post;
import com.example.personalpractice.mysite.mysitev5.PostV5;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
