
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- set object has been defined -->
<html>
  <head>
   <title> All Books</title>
  </head>
  <body>
    <h1> All Books </h1>

    <!-- scala for each loop -->
    """),_display_(/*11.6*/for(tempbook <- books) yield /*11.28*/{_display_(Seq[Any](format.raw/*11.29*/("""
      """),format.raw/*12.7*/("""<a href="#">Book Title = """),_display_(/*12.33*/tempbook/*12.41*/.title),format.raw/*12.47*/(""" """),format.raw/*12.48*/("""</a>
      <p> Price = """),_display_(/*13.20*/tempbook/*13.28*/.price),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""</p>
      <p> Author = """),_display_(/*14.21*/tempbook/*14.29*/.author),format.raw/*14.36*/(""" """),format.raw/*14.37*/("""</p>
    """)))}),format.raw/*15.6*/("""

  """),format.raw/*17.3*/("""</body>
</html>

"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Apr 28 17:37:48 BST 2018
                  SOURCE: F:/My Documents/Play Projects/BookStoreApp/app/views/Books/index.scala.html
                  HASH: 48e28812cf1fa01396e62891cab6a0d77f38a13f
                  MATRIX: 957->1|1070->21|1261->186|1299->208|1338->209|1372->216|1425->242|1442->250|1469->256|1498->257|1549->281|1566->289|1593->295|1622->296|1674->321|1691->329|1719->336|1748->337|1788->347|1819->351
                  LINES: 28->1|33->2|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|48->17
                  -- GENERATED --
              */
          