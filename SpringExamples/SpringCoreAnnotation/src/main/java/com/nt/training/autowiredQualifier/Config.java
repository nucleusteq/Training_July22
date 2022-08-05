package com.nt.training.autowiredQualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.training.autowiredQualifier")
public class Config {

	@Bean
	public Student student1() {
		return new Student(1,"Test");
	}
	
	@Bean
	public Student student2() {
		return new Student(2,"Test2");
	}
}
