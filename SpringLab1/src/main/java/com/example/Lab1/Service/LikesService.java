package com.example.Lab1.Service;

import com.example.Lab1.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Lab1.repository.PostRepository;
@Service
public class LikesService {
    @Autowired

    PostRepository postRepository;
    public Integer like(Long postId){
        Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}