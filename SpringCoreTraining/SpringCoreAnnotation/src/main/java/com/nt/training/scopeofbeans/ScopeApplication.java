package com.nt.training.scopeofbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeApplication {
	public static void main(String...args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ScopeOfBeanConfig.class);	
		Student student =(Student) applicationContext.getBean(Student.class);
		student.setName("Anjul Jindal");
		System.out.println(student);
		Student student1 =(Student) applicationContext.getBean(Student.class);
		Student student2 =(Student) applicationContext.getBean(Student.class);
		System.out.println(student1);
		System.out.println(student2);
		//applicationContext.close();
	}
}
