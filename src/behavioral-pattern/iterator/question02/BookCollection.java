package iterator.question02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Iterable<Book>{
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this.books.iterator());
    }

    public Iterator<Book> iterator(int year) {
        return new BookIterator(this.books.iterator(), year);
    }

    private class BookIterator implements Iterator<Book>{
        private Iterator<Book> bookIterator;
        private int year;

        public BookIterator(Iterator<Book> bookIterator){
            this.bookIterator=bookIterator;
            this.year=year;
        }
        public BookIterator(Iterator<Book> bookIterator,int year){
            this.bookIterator=bookIterator;
            this.year=year;
        }

        @Override
        public boolean hasNext() {
            while (bookIterator.hasNext()) {
                if (bookIterator.next().getYear() > year) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Book next() {
            return bookIterator.next();
        }
    }
}
