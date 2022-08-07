package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.annotations")
public class AnnotationConfig {
	
	public School school() {
		return new School();
		
	}
}
