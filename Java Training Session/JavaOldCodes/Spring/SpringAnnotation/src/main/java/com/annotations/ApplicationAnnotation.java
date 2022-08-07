package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
				School school =applicationContext.getBean(School.class);
		System.out.println(school);
		applicationContext.close();
		
	}

}
