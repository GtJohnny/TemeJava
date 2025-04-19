package Bookstore;

import java.util.Objects;
import java.util.Vector;

public class BookstoreCheck {
    public static boolean dubluExemplar(Vector<Book> books, Book item){
        for(Book b : books){
            if(Objects.equals(b.getTitle(), item.getTitle())
                    && Objects.equals(b.getAuthor(), item.getAuthor())
                    && Objects.equals(b.getPublisher(), item.getPublisher())
                    && b.getPageCount() == item.getPageCount()) {
                return true;
            }
        }
        return false;
    }

    public static Book compareSize(Book b1, Book b2){
        if(b1.getPageCount() > b2.getPageCount()){
            return b1;
        }
        return b2;
    }

}
