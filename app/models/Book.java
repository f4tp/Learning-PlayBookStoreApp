package models;
import java.util.*;

public class Book {
    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book(Integer idin, String titlein, Integer pricein, String authorin)
    {
        this.id  = idin;
        this.title = titlein;
        this.price = pricein;
        this.author = authorin;
    }

    private static Set<Book> books;

    static
    {
        books = new HashSet<>();
        books.add(new Book(1, "C++", 20, "ABC"));
        books.add(new Book(2, "Java", 30, "XYZ"));
    }

    public static Set<Book> allBooks()
    {
        return books;
    }

    public static Book findById(Integer idin)
    {
        //Book tempbook;
        for (Book tempbook: books)
        {
            if(idin.equals(tempbook.id))
            {
                return tempbook;
            }
        }
        return null;
    }

    public static void add (Book bookin)
    {
        books.add(bookin);
    }

    public static void remove(Book bookin)
    {
        books.remove(bookin);
    }

}
