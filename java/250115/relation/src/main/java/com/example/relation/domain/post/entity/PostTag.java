package com.example.relation.domain.post.entity;

import com.example.relation.domain.tag.Tag;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
//@Table(uniqueConstraints = )
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class PostTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tag tag;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    public void addPost(Post post) {
        this.post = post;
//        post.getPostTags().add(this);
    }

    public void addTag(Tag tag) {
        this.tag = tag;
    }
}
