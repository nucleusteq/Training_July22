package com.nt.training.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ComponentScanApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		Student student =  applicationContext.getBean(Student.class);
		System.out.println(student);
		
		
		applicationContext.close();
	}
}
