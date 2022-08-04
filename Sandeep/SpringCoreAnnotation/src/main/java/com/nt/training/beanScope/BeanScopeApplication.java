package com.nt.training.beanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanScopeConfig.class);
		
		Student student1 = applicationContext.getBean(Student.class);
		
		student1.setName("Test 123");
		System.out.println("Print 1St"+student1);
		
		System.out.println("Print 2nd "+student1);
		
		
		Student student2 = applicationContext.getBean(Student.class);
		
		System.out.println(student2);
		applicationContext.close();

	}
	
}
