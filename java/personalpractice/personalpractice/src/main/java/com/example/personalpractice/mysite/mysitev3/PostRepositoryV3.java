package com.example.personalpractice.mysite.mysitev3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepositoryV3 {
    private final EntityManager em;

    public PostV3 save(PostV3 post) {
        em.persist(post);
        return post;
    }

    public List<PostV3> findAll() {
        return em.createQuery("select p from PostV3 p", PostV3.class)
                .getResultList();
    }

    public PostV3 findById(Long id) {
        return em.find(PostV3.class, id);
    }

    public PostV3 update(Long id, PostV3 updatedPost) {
        PostV3 post = em.find(PostV3.class, id);

        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        post.update(newTitle, newContent);
        return post;
    }

    public void delete(Long id) {
        PostV3 post = em.find(PostV3.class, id);
        em.remove(post);
    }
}
