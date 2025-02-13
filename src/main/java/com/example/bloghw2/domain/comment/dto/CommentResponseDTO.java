package com.example.bloghw2.domain.comment.dto;

import com.example.bloghw2.domain.comment.entity.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponseDTO {
    private final Long commentId;
    private final String content;
    private final LocalDateTime createDate;
    private final String username;

    private int likeCount;
    public CommentResponseDTO(Comment comment) {
        this.commentId = comment.getId();
        this.content = comment.getContent();
        this.createDate = comment.getCreatedDate();
        this.username = comment.getUser().getUsername();
        this.likeCount = comment.getLikeCount();
    }
}
