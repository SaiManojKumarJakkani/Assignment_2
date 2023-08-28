package model;

import java.util.Date;

public class Comment {
    private int postId;
    private String content;
    private Date date;

    // Setters
    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getters
    public int getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }
}
