package com.nt.training.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SimpleBeanConfig.class);
		School school= applicationContext.getBean(School.class);
		System.out.println(school);
		applicationContext.close();
	}

}
