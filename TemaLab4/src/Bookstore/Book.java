package Bookstore;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public Book(Book _b){
        this.title = _b.title;
        this.author = _b.author;
        this.publisher = _b.publisher;
        this.pageCount = _b.pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "BOOK_TITLE: " + this.title.toUpperCase()+"\n"+
                "BOOK_AUTHOR: "+ this.author.toUpperCase()+"\n"+
                "BOOK_PUBLISHER: "+this.publisher.toUpperCase()+"\n";
    }
}
