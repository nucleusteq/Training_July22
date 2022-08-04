package com.training.Beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@ComponentScan
public class Lifecycleconfig {
	@Bean
	public Employee employee1() {
	return new Employee("yuvraj",1);	
	}
	@Bean
	@Primary
	public Employee employee2() {
	return new Employee("piyush",2);	
	}
	@Bean
	public Employee employee3() {
	return new Employee("ayush",3);	
	}
}
