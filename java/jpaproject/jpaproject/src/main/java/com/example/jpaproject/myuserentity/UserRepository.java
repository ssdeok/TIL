package com.example.jpaproject.myuserentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//@Repository
public interface UserRepository extends JpaRepository<PostUser, Long> {

//    @Query("SELECT u FROM PostUser ")

    // 특정 닉네임 조회
    List<PostUser> findByNickname(String nickname);
//
    // 특정 나이 조회
    List<PostUser> findByAge(int age);
//
    // 활성화된 사용자 조회
    List<PostUser> findByIsActiveTrue();
//
    // 이메일이 특정 도메인으로 끝나는 사용자 조회
    List<PostUser> findByEmailEndingWith(String domain);
//
    // 특정 나이 이후의 비활성 사용자 조회
    List<PostUser> findByAgeGreaterThanAndIsActiveFalse(int age);

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
