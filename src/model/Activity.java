package model;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private List<Post> posts;
    private List<Comment> comments;
    public Activity(){
        posts= new ArrayList<Post>();
        comments= new ArrayList<Comment>();
    }

    public void setPost(Post post) {
        this.posts.add(post);
    }

    public void setComment(Comment comment) {
        this.comments.add(comment);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Posts: ");
        if (posts != null) {
            for (Post post : posts) {
                stringBuilder.append(post.toString()).append(", ");
            }
        }
        stringBuilder.append("Comments: ");
        if (comments != null) {
            for (Comment comment : comments) {
                stringBuilder.append(comment.toString()).append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
