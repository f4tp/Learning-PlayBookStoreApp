
package views.html.Books

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.data.Form
/*3.2*/import models.Book
/*4.2*/import views.html.helper


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
  <head>
   <title> Create Book</title>
  </head>
  <body>

    <h1> Create Book </h1>
    <!--this piece of code creates a route like
    <form action=""/>books/create" method="POST">-->
      """),_display_(/*15.8*/helper/*15.14*/.form(action = routes.BooksController.save())/*15.59*/{_display_(Seq[Any](format.raw/*15.60*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(bookForm("id"))),format.raw/*16.42*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(bookForm("title"))),format.raw/*17.45*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(bookForm("price"))),format.raw/*18.45*/("""
        """),_display_(/*19.10*/helper/*19.16*/.inputText(bookForm("author"))),format.raw/*19.46*/("""
        """),format.raw/*20.9*/("""<input type="submit" value="Create Book">
      """)))}),format.raw/*21.8*/("""

  """),format.raw/*23.3*/("""</body>
</html>

"""))
      }
    }
  }

  def render(bookForm:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => apply(bookForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 29 12:10:28 BST 2018
                  SOURCE: D:/My Documents/Play Projects/BookStoreApp/app/views/Books/create.scala.html
                  HASH: 9613742693bafd165bca71cc89d16ddb95ace66a
                  MATRIX: 959->1|1055->26|1088->53|1114->73|1167->98|1194->99|1422->301|1437->307|1491->352|1530->353|1567->363|1582->369|1629->395|1666->405|1681->411|1731->440|1768->450|1783->456|1833->485|1870->495|1885->501|1936->531|1972->540|2051->589|2082->593
                  LINES: 28->1|31->2|32->3|33->4|36->5|37->6|46->15|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->21|54->23
                  -- GENERATED --
              */
          