package homeWork;

import homeWork.Author;
import homeWork.Book;

public class Main {
    public static void main(String[] args) {

Author author1 = new Author("Карл", "Маркс");
        Book book1 = new Book("Манифест коммунистической партии",1848, author1);
        Author author2 = new Author("Басё", "Мацуо");
        Book book2 = new Book("Хайку",2009, author2);
        System.out.println(book1 + " " + author1);
        System.out.println(book2 + " " + author2);
        book1.setAge(2011);
        System.out.println(book1 + " " + author1);
        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Это разные книги!");
        }



    }
}