package homeWork;

import homeWork.Author;
import homeWork.Book;

public class Main {
    public static void main(String[] args) {

Author author1 = new Author("Карл", "Маркс");
        Book book1 = new Book("Манифест коммунистической партии",1848, author1);
        Author author2 = new Author("Карл", "Маркс");
        Book book2 = new Book("Манифест коммунистической партии",1848, author2);
        System.out.println(book1 + " " + author1);
        System.out.println(book2 + " " + author2);
        book2.setAge(1950);
        System.out.println(book2 + " " + author2);
        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Это разные книги!");
        }



    }
}