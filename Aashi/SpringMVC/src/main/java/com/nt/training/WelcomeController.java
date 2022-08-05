package com.nt.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String printWelcome(ModelMap modelMap) {
		modelMap.addAttribute("message", "Spring MVC");
		return "welcome";
	}
	
	@RequestMapping(value="/processMessage" ,  method=RequestMethod.GET)
	public String processIncomingMessage(@RequestParam("message") String message, ModelMap model) {
		System.out.println("process message");
		model.addAttribute("message", message);
		return "message";
	}
}
	