package com.moneytracker.mt.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	//	@Autowired
		private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class); 

	@RequestMapping("/home")
	public String goHome() {
		System.out.println("inside /home");
		LOGGER.info("inside /home");
		return "homepage/home";
	} 

	@RequestMapping("/login")
	public String login() {

		System.out.println("Inside /login");
				LOGGER.info("inside /login");

		return "homepage/login/login";
	}

	@RequestMapping("/logout")
	public String logout() {

		System.out.println("Inside /logout");
					LOGGER.info("inside /logout");

		return "logout/logout";
	}

	@RequestMapping("/signup")
	public String signup() {

		System.out.println("Inside /signup");
						LOGGER.info("inside /signup");

		return "homepage/signup/signup";
	}


	@RequestMapping("/login-failed")
	public String loginFail() {

		System.out.println("inside login-failed");
					LOGGER.info("inside /login-failed");

		return "homepage/login/loginFailed";
	}
	public static int count=0;
	@RequestMapping(value="/welcome")
	public String welcome() {

		System.out.println("Inside welcome: "+(count++));
					LOGGER.info("inside /welcome");

		return "homepage/login/welcomehome/welcomeHome";
	}


	@RequestMapping("/*")
	public String takeHome() {
		System.out.println("inside /*");
		LOGGER.info("inside /*");
		return "homepage/home";
	}

}
