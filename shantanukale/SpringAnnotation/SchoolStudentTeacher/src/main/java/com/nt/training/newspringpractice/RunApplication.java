package com.nt.training.newspringpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		School school = context.getBean(School.class);
		System.out.println(school);
		context.close();
	}
}
