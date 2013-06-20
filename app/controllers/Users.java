package controllers;

import static play.data.Form.form;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.user.*;

public class Users extends Controller {

	public static Result create() {

		Form<User> form = form(User.class);

		return ok(create.render(form));
	}

	public static Result save() {

		Form<User> form = form(User.class).bindFromRequest();

		if (form.hasErrors()) {
			return badRequest(create.render(form));
		}

		form.get().save();
		
		flash(Application.FLASH_SUCCESS_KEY, "Invite sent to " + form.get().email);

		return ok(create.render(form));
	}
}
