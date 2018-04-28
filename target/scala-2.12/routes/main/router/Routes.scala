// @GENERATOR:play-routes-compiler
// @SOURCE:F:/My Documents/Play Projects/BookStoreApp/conf/routes
// @DATE:Sat Apr 28 17:37:47 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:26
  BooksController_2: controllers.BooksController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:26
    BooksController_2: controllers.BooksController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_3, Assets_4, BooksController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_3, Assets_4, BooksController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcomeAgain/""" + "$" + """name<[^/]+>""", """controllers.HomeController.welcomeAgain(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/""" + "$" + """namer<[^/]+>/""" + "$" + """lastnamer<[^/]+>""", """controllers.HomeController.welcome(namer:String, lastnamer:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """idOfBook<[^/]+>""", """controllers.BooksController.show(idOfBook:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""" + "$" + """idOfBook<[^/]+>""", """controllers.BooksController.edit(idOfBook:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit""", """controllers.BooksController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete/""" + "$" + """idOfBook<[^/]+>""", """controllers.BooksController.destroy(idOfBook:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_about4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about4_invoker = createInvoker(
    HomeController_1.about(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """my routes made underneath""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_welcomeAgain5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcomeAgain/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcomeAgain5_invoker = createInvoker(
    HomeController_1.welcomeAgain(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcomeAgain",
      Seq(classOf[String]),
      "GET",
      this.prefix + """welcomeAgain/""" + "$" + """name<[^/]+>""",
      """has a variable called name   passing this method a string variable called name""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_welcome6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("namer", """[^/]+""",true), StaticPart("/"), DynamicPart("lastnamer", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcome6_invoker = createInvoker(
    HomeController_1.welcome(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcome",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """welcome/""" + "$" + """namer<[^/]+>/""" + "$" + """lastnamer<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_BooksController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_index7_invoker = createInvoker(
    BooksController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "index",
      Nil,
      "GET",
      this.prefix + """books""",
      """new books controller class routes
any that require arguments have after those that don't, the tutorial flagged up an error with this""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_BooksController_create8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_create8_invoker = createInvoker(
    BooksController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "create",
      Nil,
      "GET",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_BooksController_show9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("idOfBook", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_show9_invoker = createInvoker(
    BooksController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """idOfBook<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_BooksController_edit10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/"), DynamicPart("idOfBook", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_edit10_invoker = createInvoker(
    BooksController_2.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/edit/""" + "$" + """idOfBook<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_BooksController_update11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit")))
  )
  private[this] lazy val controllers_BooksController_update11_invoker = createInvoker(
    BooksController_2.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "update",
      Nil,
      "POST",
      this.prefix + """books/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BooksController_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_save12_invoker = createInvoker(
    BooksController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "save",
      Nil,
      "POST",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_BooksController_destroy13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete/"), DynamicPart("idOfBook", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_destroy13_invoker = createInvoker(
    BooksController_2.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/delete/""" + "$" + """idOfBook<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count())
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message())
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_HomeController_about4_route(params@_) =>
      call { 
        controllers_HomeController_about4_invoker.call(HomeController_1.about())
      }
  
    // @LINE:19
    case controllers_HomeController_welcomeAgain5_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_welcomeAgain5_invoker.call(HomeController_1.welcomeAgain(name))
      }
  
    // @LINE:21
    case controllers_HomeController_welcome6_route(params@_) =>
      call(params.fromPath[String]("namer", None), params.fromPath[String]("lastnamer", None)) { (namer, lastnamer) =>
        controllers_HomeController_welcome6_invoker.call(HomeController_1.welcome(namer, lastnamer))
      }
  
    // @LINE:26
    case controllers_BooksController_index7_route(params@_) =>
      call { 
        controllers_BooksController_index7_invoker.call(BooksController_2.index())
      }
  
    // @LINE:27
    case controllers_BooksController_create8_route(params@_) =>
      call { 
        controllers_BooksController_create8_invoker.call(BooksController_2.create())
      }
  
    // @LINE:29
    case controllers_BooksController_show9_route(params@_) =>
      call(params.fromPath[Integer]("idOfBook", None)) { (idOfBook) =>
        controllers_BooksController_show9_invoker.call(BooksController_2.show(idOfBook))
      }
  
    // @LINE:30
    case controllers_BooksController_edit10_route(params@_) =>
      call(params.fromPath[Integer]("idOfBook", None)) { (idOfBook) =>
        controllers_BooksController_edit10_invoker.call(BooksController_2.edit(idOfBook))
      }
  
    // @LINE:32
    case controllers_BooksController_update11_route(params@_) =>
      call { 
        controllers_BooksController_update11_invoker.call(BooksController_2.update())
      }
  
    // @LINE:33
    case controllers_BooksController_save12_route(params@_) =>
      call { 
        controllers_BooksController_save12_invoker.call(BooksController_2.save())
      }
  
    // @LINE:35
    case controllers_BooksController_destroy13_route(params@_) =>
      call(params.fromPath[Integer]("idOfBook", None)) { (idOfBook) =>
        controllers_BooksController_destroy13_invoker.call(BooksController_2.destroy(idOfBook))
      }
  }
}
