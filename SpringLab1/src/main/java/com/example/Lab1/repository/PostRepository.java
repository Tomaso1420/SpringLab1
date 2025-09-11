package com.example.Lab1.repository;

import com.example.Lab1.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}