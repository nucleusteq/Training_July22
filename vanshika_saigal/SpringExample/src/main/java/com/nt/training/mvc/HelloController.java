package com.nt.training.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String sayHello(ModelMap map) {
		map.addAttribute("hello","Hello Spring MVC");
		return "hello";
	}
}