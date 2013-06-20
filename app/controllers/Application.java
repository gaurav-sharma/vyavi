package controllers;

import models.Idea;

import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	public static final String FLASH_SUCCESS_KEY = "success";
	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";

    public static Result index() {
    	
        return ok(index.render(Idea.all()));
    }
  
}