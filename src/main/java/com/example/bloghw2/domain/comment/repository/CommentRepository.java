package com.example.bloghw2.domain.comment.repository;

import com.example.bloghw2.domain.comment.entity.Comment;
import com.example.bloghw2.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostOrderByCreatedDateDesc(Post post);
}
