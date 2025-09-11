package com.example.Lab1;


import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
@Entity
public class Post {
    @Id
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;
    public Post( Long id, String text, Integer likes, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
        this.id = id;
    }
    public Post(){}

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }

    public Long getId(){
        return id;
    }

    public void setText(String text){
        this.text = text;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }
    public void setId(Long id){
        this.id = id;
    }
}
