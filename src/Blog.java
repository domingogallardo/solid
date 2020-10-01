import java.util.ArrayList;
import java.util.Date;

public class Blog {
    private String name;
    private ArrayList<String> posts = new ArrayList<>();
    private ArrayList<Date> dates = new ArrayList<>();
    private ArrayList<Integer> ids = new ArrayList<>();
    private static int id = 0;

    public Blog(String name) {
        this.name = name;
    }

    public int addPost(String text) {
        id++;
        posts.add(text);
        dates.add(new Date());
        ids.add(id);
        return id;
    }

    public void deletePost(int id) {
        for (int i = 0; i < ids.size(); i++) {
            if (ids.get(i).equals(id)) {
                ids.remove(i);
                posts.remove(i);
                dates.remove(i);
                break;
            }
        }
    }

    public String print() {
        String output;
        output = "Blog " + name + "\n";
        int i = 0;
        for (String post: posts) {
            output += post + "(" + dates.get(i) + ")";
            output += "\n";
            i++;
        }
        return output;
    }
}
