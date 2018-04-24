
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
/*4.2*/import helper._


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
  <head>
   <title> Create Book</title>
  </head>
  <body>

    <h1> Create Book </h1>
      """),_display_(/*13.8*/helper/*13.14*/.form(action = routes.BooksController.save())/*13.59*/{_display_(Seq[Any](format.raw/*13.60*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(bookForm("id"))),format.raw/*14.42*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(bookForm("title"))),format.raw/*15.45*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(bookForm("price"))),format.raw/*16.45*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(bookForm("author"))),format.raw/*17.46*/("""

        """),format.raw/*19.9*/("""<input type="submit" value="Create Book" />
      """)))}),format.raw/*20.8*/("""

  """),format.raw/*22.3*/("""</body>
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
                  DATE: Tue Apr 24 12:43:11 BST 2018
                  SOURCE: C:/Users/Quad/Documents/Play Projects/BookStoreApp/app/views/Books/create.scala.html
                  HASH: d9b377f5a5d4b8b7fc7cc76423e89a4075136c91
                  MATRIX: 959->1|1055->26|1088->53|1114->73|1158->89|1185->90|1312->191|1327->197|1381->242|1420->243|1457->253|1472->259|1519->285|1556->295|1571->301|1621->330|1658->340|1673->346|1723->375|1760->385|1775->391|1826->421|1863->431|1944->482|1975->486
                  LINES: 28->1|31->2|32->3|33->4|36->5|37->6|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|51->20|53->22
                  -- GENERATED --
              */
          