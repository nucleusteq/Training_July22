package com.nt.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(path = "/" , method = RequestMethod.GET )
	public String getWelcome(Model mode) {
		mode.addAttribute("message","Hey,Buddy!");
		return "welcome";
	}
}