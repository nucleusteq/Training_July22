package com.nt.training.simpleannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationcontext= new AnnotationConfigApplicationContext(SpringConfig.class);
		School sc= applicationcontext.getBean(School.class);
		
		System.out.println(sc);
		applicationcontext.registerShutdownHook();
		
		

	}

}
