package com.nt.training.formbinding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.training.formbinding.model.LoginModel;
import com.nt.training.formbinding.model.SignUpModel;

@Controller
public class FormController {
	
	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(path = "/login" , method = RequestMethod.GET)
	public String login(ModelMap map) {
		
		
		map.addAttribute("login", new LoginModel());
		
		return "login";
	}
	
	@RequestMapping(path = "/signup" , method = RequestMethod.GET)
	public String signup(ModelMap map) {
		
		
		map.addAttribute("signUpModel", new SignUpModel());
		map.addAttribute("cities", getCityList());
		
		return "signup";
	}
	
	@RequestMapping("/loginForm")
	public String authentication(@ModelAttribute("login") LoginModel loginModel) {
		System.out.println("username/password submit");
		System.out.println("Username"+loginModel.getPassword());
		System.out.println("Password"+loginModel.getPassword());
		
		return "index";
	}
	
	@RequestMapping("/processSignup")
	public String processSignup(@ModelAttribute("signUpModel") SignUpModel signUpModel) {
		System.out.println("processSignUP");
		return "sign-up-success";
	}
	
	static ArrayList<String> getCityList(){
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Indore");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Pune");
		return cities;
	}
}
