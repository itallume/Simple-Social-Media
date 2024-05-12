package entities;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private int likes;

    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(){}

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public java.lang.String getContent() {
        return content;
    }

    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
