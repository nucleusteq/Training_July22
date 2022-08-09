package com.nt.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String printWelcome() {
		//modelMap.addAttribute("message", "Spring MVC");
		return "hello";
	}
	
	

}
