package com.moneytracker.mt.web.controller;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	//	@Autowired
	//	public Logger LOGGER; 

	@RequestMapping("/home")
	public String goHome() {
		System.out.println("inside /home");
		return "home";
	} 

	@RequestMapping("/login")
	public String login() {

		System.out.println("Inside login");
		return "login";
	}

	@RequestMapping("/logout")
	public String logout() {

		System.out.println("Inside /logout");
		return "logout";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		
		System.out.println("Inside /signup");
		return "signup";
	}


	@RequestMapping("/login-failed")
	public String loginFail() {

		System.out.println("Inside welcome");
		return "loginFailed";
	}

	@RequestMapping("/welcome")
	public String welcome() {

		System.out.println("Inside welcome");
		return "welcomeHome";
	}


	@RequestMapping("/*")
	public String takeHome() {
		System.out.println("Taking you home");
		return "home";
	}

}
