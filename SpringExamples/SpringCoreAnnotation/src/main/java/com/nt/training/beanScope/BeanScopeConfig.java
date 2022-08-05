package com.nt.training.beanScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanScopeConfig {
	@Bean
	//@Scope(scopeName = "prototype")
	public Student student1() {
		return new Student();
	}
}
