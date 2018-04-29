package controllers;
import play.mvc.*;
import models.*;
import java.util.Set;
import views.html.Books.*;
import javax.inject.Inject;
import play.data.*;



public class BooksController extends Controller {

    @Inject
    play.data.FormFactory formFactory;

    public Result index()
    {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //to create book
    public Result create()
    {
        //formfactory creates us a form injected into the web page
        play.data.Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));
        //return TODO;

    }

    //POST HTTP request so going to handle data coming in
    //from create.scala.html page
    public Result save()
    {
        //get form that was generated in create method
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();


        //get book data out of form and compose book object
        Book book = bookForm.get();
         //add the book to the list calling static method in Book model
        Book.add(book);

        //redirect them to the result / where they need to be next
        return redirect(routes.BooksController.index());
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
