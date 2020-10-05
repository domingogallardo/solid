import java.util.Date;

public class ImagePost implements IPost {
    private Integer id;
    private String text;
    private Date date;
    private String author;
    private String img;

    public ImagePost(String text, String author, String img) {
        this.text = text;
        this.date = new Date();
        this.author = author;
        this.img = img;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String print() {
        return "<img>" + img + "</img> " + author + " - " + text + " (" + date + ")";
    }
}
