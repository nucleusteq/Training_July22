package com.nt.training.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ScopeApplication {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		BeanScopeAnnotations obj1 = (BeanScopeAnnotations) context.getBean("b1");
		
		obj1.setFaculty("Engineering");
		obj1.setSubject("Physics");
		System.out.println("You belong to "+obj1.getFaculty()+" and "+obj1.getSubject());
		
		BeanScopeAnnotations obj2 = (BeanScopeAnnotations)context.getBean("b1");
//		obj2.setFaculty("Medical");
//		obj2.setSubject("Biology");
		System.out.println("You belong to "+obj2.getFaculty()+" and "+obj2.getSubject());
		
		context.close();
	}
}
