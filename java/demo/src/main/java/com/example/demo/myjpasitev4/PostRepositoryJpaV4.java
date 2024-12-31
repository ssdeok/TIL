package com.example.demo.myjpasitev4;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostRepositoryJpaV4 {
    private final EntityManager em;

    public PostJpaV4 save(PostJpaV4 post) {
        em.persist(post);
        return post;
    }
}
