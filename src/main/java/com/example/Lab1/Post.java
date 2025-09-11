package com.example.Lab1;


import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post( String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
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

    public void setText(String text){
        this.text = text;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }
}
