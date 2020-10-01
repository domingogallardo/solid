public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog("Un blog");
        int post1 = blog.addPost("El primer post", "Aitana M.");
        int post2 = blog.addPost("El segundo post", "Big Foot");
        int post3 = blog.addPost("El tercer post", "Pepa Pig");
        blog.deletePost(post2);
        System.out.println(blog.print());
    }
}
