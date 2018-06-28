package com.moneytracker.mt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/home")
	public String goHome() {
		System.out.println("hellow");
		return"welcomeHome";
	}
	
	@RequestMapping("/")
	public ModelAndView dispatcherServlet() {
		
		String a = "I'm dispatcher servlet";
		
		return new ModelAndView("index","a",a );
	}

}
