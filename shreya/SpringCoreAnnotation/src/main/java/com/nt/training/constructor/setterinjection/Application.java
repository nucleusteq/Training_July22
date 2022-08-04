package com.nt.training.constructor.setterinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[]args) {
   	
	AnnotationConfigApplicationContext	applicationcontext= new AnnotationConfigApplicationContext(SpringConfig.class);
	
	School s= applicationcontext.getBean(School.class);
	System.out.println(s);
	applicationcontext.close();	
	}	
}
