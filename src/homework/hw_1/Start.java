package homework.hw_1;

public class Start {

    public static void main(String[] args) {

        Post post = new Post(1, 1, "title", "body");
        Post post1 = new Post(2, 3, "title", "body");
//        System.out.println(post.equals(post1));
        System.out.println(post);


        // ClassWork:

        Address address = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", new Geo("-37.3159", "81.1496"));
        User singleUser = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address, "1-770-736-8031 x56442", "hildegard.org", new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"));


        System.out.println(singleUser);

    }
}
