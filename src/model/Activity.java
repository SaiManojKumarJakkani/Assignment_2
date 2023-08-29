package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity {
    private int id;
    private String activityType;
    private int postId;
    private String content;
    private Privacy privacy;
    private Date date;

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public void setDate() {
        Date currentDate = new Date();
        this.date = currentDate;
    }

    // Getters
    public int getId() {
        return id;
    }
    public int getPostId() {
        return this.postId;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public String getContent() {
        return content;
    }

    public Privacy getPrivacy() {
        return privacy;
    }

    public Date getDate() {
        return date;
    }

}
