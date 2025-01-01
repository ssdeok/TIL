package com.example.demo.myjpasitev4;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostRepositoryJpaV5 {
    private final EntityManager em;

    public PostJpaV5 save(PostJpaV5 post) {
        em.persist(post);
        return post;
    }
}
