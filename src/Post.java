import java.util.Date;

public class Post {
    private Integer id;
    private String text;
    private Date date;

    public Post(String text) {
        this.text = text;
        this.date = new Date();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String print() {
        return text + " (" + date + ")";
    }
}
