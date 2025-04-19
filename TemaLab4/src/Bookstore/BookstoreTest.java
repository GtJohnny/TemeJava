package Bookstore;

import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class BookstoreTest {

    private static int bookCount;
    private static Vector<Book> books;
    public static Book createBook(String Title, String Author,String Publisher,int pageCount){
        return new Book(Title,Author,Publisher,pageCount);
    };

    public static Book getBook(String Title){
        for(Book book : books){
            if(Objects.equals(book.getTitle(), Title)){
                return book;
            }
        }
        return null;
    };

    public static Book getBook(String Title,String Author){
        for(Book book : books){
            if(Objects.equals(book.getTitle(), Title) && Objects.equals(book.getAuthor(),Author)){
                return book;
            }
        }
        return null;
    };

    public static Boolean deleteBook(Book book){
        for (Book b : books){
            if(b == book){
                books.remove(b);
                return true;
            }
        }
        return false;
    }

    public static void updateBook(Book book,String Title){
        book.setTitle(Title);
    }


    public static void printBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public static void citesteCarti(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add how many books?");
        bookCount = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<bookCount;i++){
            String Title;
            String Auth;
            String Publisher;
            int pages;
            System.out.print("Titlu: ");
            Title = sc.nextLine();
            System.out.print("Autor: ");
            Auth = sc.nextLine();
            System.out.print("Publicist: ");
            Publisher = sc.nextLine();
            System.out.print("Numar pagini: ");
            pages = sc.nextInt();
            sc.nextLine();
            books.add(createBook(Title,Auth,Publisher,pages));
        }



    }

    public static void main(String[] args) {

        books = new Vector<Book>();
        citesteCarti();
        printBooks();

        Book dup_book =new Book(books.elementAt(0));

        if(BookstoreCheck.dubluExemplar(books,dup_book)){
            System.out.println("Cartea " + dup_book + " deja exista.");
        }else{
            System.out.println("Cartea " + dup_book + " nu exista deja.");
        }
        Book thicker_book = BookstoreCheck.compareSize(books.get(0), books.get(1));
        System.out.println("Cartea cea mai groasa dintre primele 2 este: "+thicker_book);
    }



}
