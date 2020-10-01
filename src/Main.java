public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog("Mi blog");
        int post1 = blog.addPost("Mi primer post");
        int post2 = blog.addPost("Mi segundo post");
        int post3 = blog.addPost("Mi tercer post");
        blog.deletePost(post2);
        System.out.println(blog.print());
    }
}
