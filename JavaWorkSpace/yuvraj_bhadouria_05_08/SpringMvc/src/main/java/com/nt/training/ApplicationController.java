package com.nt.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.training.LogIn;
import com.nt.training.SignUp;

@Controller
public class ApplicationController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getWelcome() {
		return "home";
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getLogin(ModelMap model) {
		model.addAttribute("loginModel", new LogIn());
		return "login";
	}

	@RequestMapping(path = "/signup", method = RequestMethod.GET)
	public String getSignUp(ModelMap model) {
		model.addAttribute("signUpModel", new SignUp());
		return "signup";
	}

	@RequestMapping(path = "/postsignup", method = RequestMethod.POST)
	public String signUp(@ModelAttribute("signUpModel") SignUp signUp) {
		System.out.println(signUp.getUserName());
		System.out.println(signUp.getUserPassword());
		return "postsignup";
	}
}
