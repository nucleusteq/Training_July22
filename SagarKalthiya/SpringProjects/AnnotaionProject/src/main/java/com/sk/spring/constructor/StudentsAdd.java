package com.sk.spring.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentsAdd {
	
	@Bean
	@Scope(value="prototype")
	public Students students() {
		return new Students(1 , "");
		
	}
	


}
