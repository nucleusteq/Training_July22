package com.training.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Springconfig.class);
	School sc = context.getBean(School.class);
	System.out.println(sc);
	
}
}
