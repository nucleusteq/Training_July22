package com.nt.training.autowiredInjection2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class JioController {
	@Autowired
	@Qualifier("jioCustomerServiceImpl")
	public CustomerService customerService;
}
