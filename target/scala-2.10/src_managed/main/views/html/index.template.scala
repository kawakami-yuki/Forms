
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Application.InputData],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String, inputData: Form[Application.InputData]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

  <h1>Hello, Forms!</h1>
  <p>"""),_display_(Seq[Any](/*6.7*/msg)),format.raw/*6.10*/("""</p>
  """),_display_(Seq[Any](/*7.4*/helper/*7.10*/.form(action = routes.Application.send())/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),_display_(Seq[Any](/*8.6*/(helper.inputText(inputData("input"),'_label->"あなたの名前",'_help->"必須",'_error->"This field is required")(mytextinput, implicitly[Lang])))),format.raw/*8.140*/("""
    """),_display_(Seq[Any](/*9.6*/(helper.inputPassword(inputData("pass"),'_label->"パスワード")))),format.raw/*9.64*/("""
    """),_display_(Seq[Any](/*10.6*/(helper.checkbox(inputData("check"),args='checked->"checked",'_text->"")))),format.raw/*10.79*/("""
    """),_display_(Seq[Any](/*11.6*/(helper.inputRadioGroup(inputData("radio"),options = helper.options(("windows","MS-Windows"),("mac","Mac OS X"),("linux","Linux")))))),format.raw/*11.138*/("""
    """),_display_(Seq[Any](/*12.6*/(helper.select(inputData("select"),args='size->"3",
            options = helper.options(("jp","日本"),("us","アメリカ"),("uk","イギリス")))))),format.raw/*13.80*/("""
    """),_display_(Seq[Any](/*14.6*/(helper.textarea(inputData("area"))))),format.raw/*14.42*/("""
    """),_display_(Seq[Any](/*15.6*/(helper.inputDate(inputData("date"))))),format.raw/*15.43*/("""
    """),_display_(Seq[Any](/*16.6*/(helper.inputText(inputData("inputNum"),args='type->"number",'max->"100",'min->"10",'value->"50")))),format.raw/*16.104*/("""
    <input type = "submit">
  """)))})),format.raw/*18.4*/("""


""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(msg:String,inputData:Form[Application.InputData]): play.api.templates.HtmlFormat.Appendable = apply(msg,inputData)
    
    def f:((String,Form[Application.InputData]) => play.api.templates.HtmlFormat.Appendable) = (msg,inputData) => apply(msg,inputData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 10 17:20:25 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/Forms/app/views/index.scala.html
                    HASH: b03ce1c7db4365982b8b19af239e69bc47c7c206
                    MATRIX: 802->1|949->54|986->57|1017->80|1056->82|1123->115|1147->118|1189->126|1203->132|1252->173|1291->175|1331->181|1487->315|1527->321|1606->379|1647->385|1742->458|1783->464|1938->596|1979->602|2132->733|2173->739|2231->775|2272->781|2331->818|2372->824|2493->922|2556->954|2591->958
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|35->7|35->7|35->7|35->7|36->8|36->8|37->9|37->9|38->10|38->10|39->11|39->11|40->12|41->13|42->14|42->14|43->15|43->15|44->16|44->16|46->18|49->21
                    -- GENERATED --
                */
            