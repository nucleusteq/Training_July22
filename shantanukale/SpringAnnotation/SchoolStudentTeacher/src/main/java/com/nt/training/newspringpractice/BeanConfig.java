package com.nt.training.newspringpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.training.newspringpractice")
public class BeanConfig {
	@Bean
	public Student student() {
		return new Student("1","Parth");
	}
	@Bean
	public Teacher teacher() {
		return new Teacher("1","Sandeep");
	}
}
