package controllers;

import static play.data.Form.form;
import models.Idea;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.idea.create;

public class Ideas extends Controller {

	public static Result create() {

		Form<Idea> form = form(Idea.class);

		return ok(create.render(form));
	}

	public static Result save() {

		Form<Idea> form = form(Idea.class).bindFromRequest();

		if (form.hasErrors()) {
			return badRequest(create.render(form));
		}

		form.get().save();

		return redirect(controllers.routes.Application.index());
	}
}
