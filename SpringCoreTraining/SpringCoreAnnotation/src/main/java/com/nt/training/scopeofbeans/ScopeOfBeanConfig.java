package com.nt.training.scopeofbeans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class ScopeOfBeanConfig {
	@Bean
	@Scope(value="prototype")
	//@Scope(value="singleton")
	public Student student() {
		return new Student(1,"Manav Jindal");
	}
}
