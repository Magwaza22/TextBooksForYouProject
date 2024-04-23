package za.ac.cput.util;


import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.Builder()
                .withTitle("The Great Gatsby")
                .withAuthor("F. Scott Fitzgerald")
                .withPublicationYear(1925)
                .withIsbn("978-3-16-148410-0")
                .build();

        Book book2 = new Book.Builder()
                .withTitle("To Kill a Mockingbird")
                .withAuthor("Harper Lee")
                .withPublicationYear(1960)
                .withIsbn("978-3-16-148420-0")
                .build();

        System.out.println(book1);
        System.out.println(book2);
    }
}
