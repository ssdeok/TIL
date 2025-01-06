package com.example.jpaproject.myuserentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public interface UserRepository extends JpaRepository<PostUser, Long> {


//    private List<PostUser> posts = new ArrayList<>();
//    private Long id = 0L;
//
//    public PostUser save(PostUser newPost) {
//
//        String username = newPost.getUsername();
//        String email = newPost.getEmail();
//        String nickname = newPost.getNickname();
//        int age = newPost.getAge();
//        boolean isActive = newPost.isActive();
//
//        PostUser postUser = new PostUser(++id, username, email, nickname, age, isActive);
//        posts.add(postUser);
//        return postUser;
//    }
//
//    public List<PostUser> findAll() {
//        return posts;
//    }
//
//    public PostUser findById(Long id) {
//        for (PostUser postUser : posts) {
//            if (postUser.getId().equals(id)) {
//                return postUser;
//            }
//        }
//        return null;
//    }
//
//    public PostUser modify(Long id, PostUser updatedPost) {
//
//        String newUserName = updatedPost.getUsername();
//        String newEmail = updatedPost.getEmail();
//        String newNickname = updatedPost.getNickname();
//        int newAge = updatedPost.getAge();
//        boolean newIsActive = updatedPost.isActive();
//
//        for (PostUser postUser : posts) {
//            if (postUser.getId().equals(id)) {
//                postUser.setUsername(newUserName);
//                postUser.setEmail(newEmail);
//                postUser.setNickname(newNickname);
//                postUser.setAge(newAge);
//                postUser.setActive(newIsActive);
//                return postUser;
//            }
//        }
//        return null;
//    }
//
//    public void delete(PostUser postUser) {
//        posts.remove(postUser);
//    }
}
