package com.example.relation.domain.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    // PostId라는걸 필터링해서 Comment를 가져온다. / comment를 찾을거야 PostId를 통해서.
    List<Comment> findByPostId(Long postId);
}
