package lesson011.homeTask02;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}

class Main {
    public static void main(String[] args) {
       List<Book> books = new ArrayList<>();

       books.add(new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 1865));
       books.add(new Book("Don Quixote", "Miguel de Cervantes", 1605));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("La Divina Commedia", "Dante Alighieri", 1472));

        for (Book book : books) {
                System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYear());
        }

        System.out.println("-----------");
        books.stream()
                .filter((book -> book.getYear() > 1800))
                .map(book -> book.getTitle())
                .forEach(
                        (String title) -> System.out.println(title)
                );
    }
}