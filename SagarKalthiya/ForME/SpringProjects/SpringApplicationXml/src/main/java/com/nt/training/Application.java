package com.nt.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Application {

	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}
	
}
