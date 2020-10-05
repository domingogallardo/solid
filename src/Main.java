public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog("Un blog");
        int post1 = blog.addPost(new Post("El primer post"));
        int post2 = blog.addPost(new Post("El segundo post"));
        int post3 = blog.addPost(new Post("El tercer post"));
        blog.deletePost(post2);
        System.out.println(blog.print());
    }
}
