package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/sayhello")
	public ModelAndView sayHello() {

		String message = "Welcome to Spring MVC";
		System.out.println("Inside Action");
		return new ModelAndView("hello", "mymessage", message);
		//"mymessage" is the key, and message is the value

	}

}
