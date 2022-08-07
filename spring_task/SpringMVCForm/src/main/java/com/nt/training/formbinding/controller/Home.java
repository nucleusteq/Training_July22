package com.nt.training.formbinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Home {
	
	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
}