package com.aanchal.blog_rest_api.service;

import com.aanchal.blog_rest_api.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post savePost(Post post);
    Post updatePost(Long id, Post post);
    void deletePost(Long id);
}
