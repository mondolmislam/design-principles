package iterator.question02;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Catcher in the Rye", "J. D. Salinger", 1951));
        bookCollection.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        bookCollection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        bookCollection.addBook(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 1967));
        bookCollection.addBook(new Book("1984", "George Orwell", 1949));

// Create a new BookIterator object to retrieve books published after 1950
        Iterator<Book> iterator = bookCollection.iterator(1951);

// Iterate over the books and print their titles and authors
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
