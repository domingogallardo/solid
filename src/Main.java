public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog("Un blog");
        int post1 = blog.addPost(new Post("El primer post", "Aitana M."));
        int post2 = blog.addPost(new Post("El segundo post", "Big Foot"));
        int post3 = blog.addPost(new ImagePost("El tercer post", "Pepa Pig",
                "http://myhost.com/my-image.png"));
        blog.deletePost(post2);
        System.out.println(blog.print());
    }
}
