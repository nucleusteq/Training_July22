package com.nt.training3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Main_Scope_config {
	
	@Bean
	@Scope(value="prototype")
	//@Scope(value="singleton")
	
	
	public Employee emp() {
		
		return new Employee(111,"hello Employee Bean");
	}

}
