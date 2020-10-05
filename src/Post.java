import java.util.Date;

public class Post implements IPost {
    private Integer id;
    private String text;
    private Date date;
    private String author;

    public Post(String text, String author) {
        this.text = text;
        this.date = new Date();
        this.author = author;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String print() {
        return author + " - " + text + " (" + date + ")";
    }
}
