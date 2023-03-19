package homework3.part1;
//а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Library.add(new Book("book1"));
        Library.add(new Book("book2"));
        Library.add(new Magazine("magazine") );

        Library.showMagazines();
        Library.showBooks();
    }

}
