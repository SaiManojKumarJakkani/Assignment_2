package model;
import java.util.Date;
enum Privacy {
    ANYONE,
    ANYONE_TWITTER,
    CONNECTIONS_ONLY,
}

public class Post {
    private int id;
    private String content;
    private Privacy privacy;
    private Date date;

    // Setters
    public void setId(int id) {
        this.id = id;
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
