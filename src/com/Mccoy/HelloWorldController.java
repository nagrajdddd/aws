package com.Mccoy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/nag")
	public ModelAndView helloWorld() {

		String message = "Hello World, Welcome to Spring 3.0!";
		return new ModelAndView("hello", "message", message);
	}
}