package main.java.models;

import java.util.Date;

public class Comments {
    private int id;
    private String text;
    private String author;
    private boolean like;
    private Date created;

   public Comments(){}
   public Comments(int newId, String newAuthor, String newText){
       id = newId;
       text = newText;
       author = newAuthor;
       created = new Date();

   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor(){
       return author;
    }

    public void setAuthor(String author){
       this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }



}
