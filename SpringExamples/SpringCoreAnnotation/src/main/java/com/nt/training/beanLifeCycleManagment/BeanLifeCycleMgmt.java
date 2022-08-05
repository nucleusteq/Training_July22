package com.nt.training.beanLifeCycleManagment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanLifeCycleMgmt {

	@Bean(name = "student1")
	@Primary
	public Student student1() {
		return new Student("Test" , 1);
	}
	
	@Bean(name = "student2")
	public Student student2() {
		return new Student("Test2" , 2);
	}
	@Bean(name = "student3")
	public Student student3() {
		return new Student("Test3" , 3);
	}
	
}
