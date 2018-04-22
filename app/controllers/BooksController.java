package controllers;
import play.mvc.*;
import models.*;
import java.util.Set;
import views.html.Books.*;
//import views.Books.*;

public class BooksController extends Controller {

    public Result index()
    {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //to create book
    public Result create()
    {
        return TODO;
    }

    public Result save()
    {
        return TODO;
    }

    public Result edit(Integer idOfBook)
    {
        return TODO;
    }

    public Result update()
    {
        return TODO;
    }

    public Result destroy(Integer idOfBook)
    {
        return TODO;
    }

    //to return book details
    public Result show(Integer idOfBook)
    {
        return TODO;
    }


}
