package com.example.personalpractice.mysite.mysitev2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepositoryV2{

    @PersistenceUnit
    private final EntityManagerFactory emf;

    public PostV2 save(PostV2 post) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {

            tx.begin();
            em.persist(post);
            tx.commit();
            return post;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public PostV2 findById(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            return em.find(PostV2.class, id);
        } finally {
            em.close();
        }
    }

    public List<PostV2> findAll(){
        EntityManager em = emf.createEntityManager();

        try {
            return em.createQuery("select p from PostV2 p", PostV2.class)
                    .getResultList();
        } finally {
            em.close();
        }
}

    public PostV2 update(Long id, PostV2 updatedPost) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            PostV2 post = em.find(PostV2.class, id);

            String newTitle = updatedPost.getTitle();
            String newContent = updatedPost.getContent();

            post.update(newTitle, newContent);

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
            PostV2 post = em.find(PostV2.class, id);
            em.remove(post);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }







//    private List<Post> posts = new ArrayList<>();
//    private Long id = 0L;
//
//    public Post save(Post newPost) {
//
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        Post post = new Post(++id, title, content);
//        posts.add(post);
//        return post;
//    }
//
//    public List<Post> findAll() {
//        return posts;
//    }
//
//    public Post findById(Long id) {
//        for (Post post : posts) {
//            if (post.getId().equals(id)) {
//                return post;
//            }
//        }
//        return null;
//    }
//
//    public Post modify(Long id, Post updatedPost) {
//        String newTitle = updatedPost.getTitle();
//        String newContent = updatedPost.getContent();
//
//        for (Post post : posts) {
//            if (post.getId().equals(id)) {
//                post.setTitle(newTitle);
//                post.setContent(newContent);
//                return post;
//            }
//        }
//        return null;
//    }
//
//    public void delete(Post post) {
//        posts.remove(post);
//    }
}
