package controllers;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        int i = 100;
        String name = "RaidxCode";
       // return ok(index.render("This is work that Paul Treadwell has typed in"));
        return ok("Hello Play");
        //practicing with  Git
    }


    //call with http://localhost:9000/about
    public Result about()
    {
        return ok( "About");
    }

    //call with e.g. http://localhost:9000/welcome/nameExample
    public Result welcome(String name)
    {
        return ok(name);
    }

    // call with e.g.  http://localhost:9000/welcomeAgain/Peter/Beard
    public Result welcomeAgain(String namer, String lastnamer)
    {
        return ok("welcome " + namer + " " + lastnamer + " to our humble website");
    }

}
