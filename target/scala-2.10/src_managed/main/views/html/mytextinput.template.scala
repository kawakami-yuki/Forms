
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
object mytextinput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

<dl class=" " id="input_field">
<dt><label for="input">"""),_display_(Seq[Any](/*4.25*/elements/*4.33*/.label)),format.raw/*4.39*/("""</label></dt>
<dd>"""),_display_(Seq[Any](/*5.6*/elements/*5.14*/.input)),format.raw/*5.20*/("""</dd>
"""),_display_(Seq[Any](/*6.2*/if(elements.hasErrors)/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
	<dd class="error">"""),_display_(Seq[Any](/*7.21*/elements/*7.29*/.errors)),format.raw/*7.36*/("""</dd>
""")))})),format.raw/*8.2*/("""
<dd class="info">"""),_display_(Seq[Any](/*9.19*/elements/*9.27*/.infos)),format.raw/*9.33*/("""</dd>
</dl>"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 10 17:20:58 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/Forms/app/views/mytextinput.scala.html
                    HASH: f6e881a0889633428a6ad74c6ad6ac384adbb05e
                    MATRIX: 794->1|920->33|1013->91|1029->99|1056->105|1109->124|1125->132|1152->138|1193->145|1223->167|1261->168|1317->189|1333->197|1361->204|1398->211|1452->230|1468->238|1495->244
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|37->9|37->9|37->9
                    -- GENERATED --
                */
            