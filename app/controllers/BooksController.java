package controllers;
import play.mvc.*;
import models.*;
import java.util.Set;
import views.html.Books.*;
import javax.inject.Inject;
import play.data.*;



public class BooksController extends Controller {

    @Inject
    FormFactory myFormFactory;

    public Result index()
    {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //to create book
    public Result create()
    {
        //formfactory creates us a form for injected into the web page
        Form<Book> bookForm = myFormFactory.form(Book.class);
        return ok(create.render(bookForm));
        //return TODO;

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
