package homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> authors = new <String>ArrayList();
        authors.add("J. K. Rowling");
        authors.add("J. K. Rowlingová");

        Book bookHarry = new Book("Harry Potter",268,"fantasy",authors);
        System.out.println(bookHarry);

        Car venicle = new Car("Skoda",110.5,2, 200.5);
        System.out.println(venicle);

        Dog pes = new Dog("Zhuk",5,"bulldog");
        System.out.println(pes);

        Post post = new Post(1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");
        System.out.println(post);


        ArrayList<String> titles = new <String> ArrayList();
        titles.add("hello");

        Comment comment = new Comment(1,"id labore ex et quam laborum","Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium",titles);
        System.out.println(comment);
    }

}
