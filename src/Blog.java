import java.util.ArrayList;

public class Blog {
    private String name;
    private ArrayList<Post> posts = new ArrayList<>();
    private static int id = 0;

    public Blog(String name) {
        this.name = name;
    }

    public int addPost(Post post) {
        id++;
        posts.add(post);
        post.setId(id);
        return id;
    }

    public void deletePost(int id) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getId().equals(id)) {
                posts.remove(i);
                break;
            }
        }
    }

    public String print() {
        String output = "** " + name + " **\n";
        int i = 0;
        for (Post post: posts) {
            output += post.print();
            output += "\n";
            i++;
        }
        return output;
    }
}
