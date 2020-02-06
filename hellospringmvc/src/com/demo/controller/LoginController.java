package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;
import java.util.Map;
//mention: do not import Map from other package, it will not work

import javax.validation.Valid;

@Controller("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String loadLoginForm(Map model) {

		LoginForm loginform = new LoginForm();
		model.put("loginForm", loginform);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processingLogin(Map model,@Valid LoginForm loginform, BindingResult result) {
		System.out.println(loginform.getUsername() + ":" + loginform.getPassword());
		model.put("loginForm", loginform);
		
		if (result.hasErrors())
			return "login";
		else if (loginform.getUsername().equals("Admin"))
			return "welcome";
		else
			return "error";
	}
}