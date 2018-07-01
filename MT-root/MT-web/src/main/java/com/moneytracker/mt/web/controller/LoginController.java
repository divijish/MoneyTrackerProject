package com.moneytracker.mt.web.controller;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	//	@Autowired
	//	public Logger LOGGER; 

	@RequestMapping("/home")
	public String goHome() {
		System.out.println("inside /home");
		return "homepage/home";
	} 

	@RequestMapping("/login")
	public String login() {

		System.out.println("Inside /login");
		return "homepage/login/login";
	}

	@RequestMapping("/logout")
	public String logout() {

		System.out.println("Inside /logout");
		return "logout/logout";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		
		System.out.println("Inside /signup");
		
		return "homepage/signup/signup";
	}


	@RequestMapping("/login-failed")
	public String loginFail() {

		System.out.println("inside login-failed");
		
		return "homepage/login/loginFailed";
	}
public static int count=0;
	@RequestMapping(value="/welcome")
	public String welcome() {

		System.out.println("Inside welcome: "+(count++));
		
		return "homepage/login/welcomehome/welcomeHome";
	}


	@RequestMapping("/*")
	public String takeHome() {
		System.out.println("inside /*");
		return "homepage/home";
	}

}
