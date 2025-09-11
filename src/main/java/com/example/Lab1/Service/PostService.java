package com.example.Lab1.Service;


import com.example.Lab1.Post;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Первый пост", new Date()));
        posts.add(new Post("Второй пост", new Date()));
        posts.add(new Post("Третий пост", new Date()));
        return posts;
    }
}
