package com.nt.training;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.training.model.LoginModel;
import com.nt.training.model.SignUpModel;

@Controller
public class ApplicationController {
	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String getWelcome() {
		return "welcome";
	}
	
	@RequestMapping(path="/login",method= RequestMethod.GET)
	public String getLogin(ModelMap model) {
		model.addAttribute("loginModel",new LoginModel());
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
		model.addAttribute("signUpModel", new SignUpModel());
		model.addAttribute("cities",getCities());
		return "signup";
	}
	@RequestMapping(path = "/signupForm",method = RequestMethod.POST)
	public String signUp(@ModelAttribute("signUpModel") SignUpModel signUpModel) {
		System.out.println(signUpModel.getFirstName());
		System.out.println(signUpModel.getLastName());
		System.out.println(signUpModel.getCity());
		return"signupsuccess";
	}
	public ArrayList<String> getCities(){
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("Indore");
		cities.add("Pune");
		cities.add("Bhopal");
		cities.add("Jabalpur");
		cities.add("Udaipur");
		cities.add("Jaipur");
		cities.add("Patna");
		cities.add("Ranchi");
		cities.add("Nagpur");
		cities.add("Raipur");
		return cities;
	}
}
