package com.example.demo.myjpasitev5;


import com.example.demo.myjpasitev3.PostJpaV3;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepositoryJpaV5 {
    private final EntityManager em;

    public com.example.demo.myjpasitev3.PostJpaV3 save(com.example.demo.myjpasitev3.PostJpaV3 post) {
        em.persist(post);
        return post;
    }

    public List<com.example.demo.myjpasitev3.PostJpaV3> findAll() {
        return em.createQuery("SELECT p FROM PostJpaV3 p", com.example.demo.myjpasitev3.PostJpaV3.class)
                .getResultList();
    }

    public com.example.demo.myjpasitev3.PostJpaV3 findById(Long id) {
        return em.find(com.example.demo.myjpasitev3.PostJpaV3.class, id);
    }

    public com.example.demo.myjpasitev3.PostJpaV3 update(Long id, com.example.demo.myjpasitev3.PostJpaV3 updatedPost) {
        com.example.demo.myjpasitev3.PostJpaV3 post = em.find(com.example.demo.myjpasitev3.PostJpaV3.class, id);

        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        post.update(newTitle, newContent);
        return post;
    }

    public void delete(Long id) {
        com.example.demo.myjpasitev3.PostJpaV3 post = em.find(PostJpaV3.class, id);
        em.remove(post);
    }
}














