package com.aanchal.blog_rest_api.service;

import com.aanchal.blog_rest_api.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long postId, Comment newComment);
    List<Comment> getCommentsByPostId(Long postId);
    Comment getCommentById(Long postId, Long commentId);
    Comment updateComment(Long postId, Long CommentId, Comment updateComment);
    void deleteComment(Long postId, Long commentId);
}
