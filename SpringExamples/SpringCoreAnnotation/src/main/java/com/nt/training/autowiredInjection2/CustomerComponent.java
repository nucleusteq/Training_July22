package com.nt.training.autowiredInjection2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CustomerComponent {

	@Autowired
	public CustomerService customerService;
	
	
}
