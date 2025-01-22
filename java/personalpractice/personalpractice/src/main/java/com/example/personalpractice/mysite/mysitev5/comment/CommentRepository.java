package com.example.personalpractice.mysite.mysitev5.comment;


import com.example.personalpractice.mysite.Post;
import com.example.personalpractice.mysite.mysitev5.PostV5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);

    Optional<PostV5> findByIdWithComment(@Param(("id")) Long id);
}
