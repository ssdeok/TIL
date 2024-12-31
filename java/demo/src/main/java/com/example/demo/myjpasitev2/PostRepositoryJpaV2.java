package com.example.demo.myjpasitev2;


import com.example.demo.myjpasite.PostJpa;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepositoryJpaV2 {

    // 뭔지는 몰라도되지만 DI 하고싶다 / DI하려면 생성자가 필요
    @PersistenceUnit
    private final EntityManagerFactory emf;

    public PostJpaV2 save(PostJpaV2 post) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(post); // 저장

            tx.commit();
            return post;

        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();

        }
    }

    public PostJpaV2 findById(Long id) {
        EntityManager em = emf.createEntityManager();
        try{
            // 정해진 문법
            return em.find(PostJpaV2.class, id);
        } finally {
            emf.close();
        }
        
        
    }

    public List<PostJpaV2> findAll() {
        EntityManager em = emf.createEntityManager();
        // post에서 모든 데이터를 가져오고 싶어.
        // SELECT * from posts p

        try {
            return em.createQuery("SELECT p FROM PostJpaV2 p", PostJpaV2.class)
                    .getResultList();
        } finally {
            em.close();
        }


    }

    public PostJpaV2 update(Long id, PostJpaV2 updatePost) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            // 업데이트할 entity를 가져온다.
            PostJpaV2 post = em.find(PostJpaV2.class, id);

            // 수정한다
            String title = updatePost.getTitle();
            String content = updatePost.getContent();

            post.update(title, content);

            tx.commit();
            return post;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public void delete(Long id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            PostJpaV2 post = em.find(PostJpaV2.class, id);
            em.remove(post);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

}












