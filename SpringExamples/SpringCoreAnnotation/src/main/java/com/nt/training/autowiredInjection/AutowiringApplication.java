package com.nt.training.autowiredInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AutowiringApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Config.class);
		School school = applicationContext.getBean(School.class);
		System.out.println(school);
		applicationContext.close();

	}
	
}
