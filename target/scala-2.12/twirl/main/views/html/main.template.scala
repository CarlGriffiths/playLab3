
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>
        """),format.raw/*19.32*/("""
        """),format.raw/*20.9*/("""<ul>
        <li><a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.index()),format.raw/*21.52*/("""">Home</a></li>
        <li><a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.about()),format.raw/*22.52*/("""">About</a></li>
        <li><a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.product()),format.raw/*23.54*/("""">Products</a></li>
        
        </ul>

        """),_display_(/*27.10*/content),format.raw/*27.17*/("""

        """),format.raw/*29.9*/("""<hr>
        <h3>Copyright &copy 2017</h3>

        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("javascripts/main.js")),format.raw/*32.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 31 13:57:12 GMT 2017
                  SOURCE: /media/sf_web/playapps/lab3/app/views/main.scala.html
                  HASH: 37185dc7b76f0adc3ed4186aa5ed57d2b92480b5
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1625->481|1640->487|1703->528|1791->589|1806->595|1867->634|1929->758|1965->767|2019->794|2034->800|2078->823|2143->861|2158->867|2202->890|2268->929|2283->935|2329->960|2409->1013|2437->1020|2474->1030|2567->1096|2582->1102|2643->1142
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|49->19|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|57->27|57->27|59->29|62->32|62->32|62->32
                  -- GENERATED --
              */
          