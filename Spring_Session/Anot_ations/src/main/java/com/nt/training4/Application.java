package com.nt.training4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SimpleConfig.class);
		School school= applicationContext.getBean(School.class);
		System.out.println(school);
		applicationContext.close();
	}

}