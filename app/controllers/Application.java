package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.Required;

import views.html.*;

public class Application extends Controller {

	public static class InputData {
     @Required(message = "This field is required")
   	 public String input;
   	 public String pass;
     public String check;
     public String radio;
     public String select;
     public String area;
     public String date;
     public String inputNum;
  	}

    public static Result send() {
      String msg = "";
      Form<InputData> inputForm = form(InputData.class).bindFromRequest();
      if(!inputForm.hasErrors()){
        InputData data = inputForm.get();
       
        msg = "value: input = " + data.input + ", pass = " + data.pass + ", check = " + data.check
              + ", radio = " + data.radio + ", select = " + data.select + ", area = " + data.area
              + ", date = " + data.date + ", inputNum = " + data.inputNum;
        
      }else{
        msg = "Error";
      }
      return ok(index.render(msg,inputForm));
    }

  	public static Result index() {
      Form<InputData> inputForm = Form.form(InputData.class);
      InputData f = new InputData();
      f.input = "default value";
      f.radio = "mac";
      f.select = "uk";
      f.inputNum = "50";
      inputForm = inputForm.fill(f);
  		return ok(index.render("フォームを入力してください。",inputForm));
    }

}
