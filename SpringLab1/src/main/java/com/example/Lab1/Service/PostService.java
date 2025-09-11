package com.example.Lab1.Service;


import com.example.Lab1.Post;
import org.springframework.stereotype.Service;
import com.example.Lab1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(postRepository.count() + 1, text, 0, new Date());
        postRepository.save(post);
    }
}
