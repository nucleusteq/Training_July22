package com.nt.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.training.model.LoginModel;
import com.nt.training.model.SignupModel;

@Controller
public class WelcomeController {
	
	@RequestMapping(path = "/" , method = RequestMethod.GET )
	public String getWelcome(Model mode) {
		mode.addAttribute("message","Welcome to our Page!");
		return "welcome";
	}
	
	@RequestMapping(path="/login",method= RequestMethod.GET)
	public String getLogin(ModelMap model) {
		model.addAttribute("LoginModel",new LoginModel());
		return "login";
	}
	
	@RequestMapping(path="/loginForm",method = RequestMethod.POST)
	public String authentication(@ModelAttribute("loginModel") LoginModel loginModel) {
		System.out.println(loginModel.getUserName());
		System.out.println(loginModel.getUserPassword());
		return "dashboard";
	}
	@RequestMapping(path="/signup",method=RequestMethod.GET)
	public String getSignUp(ModelMap model) {
		model.addAttribute("signupModel", new SignupModel());
		return "signup";
	}
	@RequestMapping(path = "/signupForm",method = RequestMethod.POST)
	public String signUp(@ModelAttribute("signupModel") SignupModel signupModel) {
		System.out.println(signupModel.getFirstName());
		System.out.println(signupModel.getLastName());
		return"signupsuccess";
	}
}
