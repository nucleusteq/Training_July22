package com.nt.training.beanLifeCycleManagment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCycleMgmtApplication {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanLifeCycleMgmt.class);
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);
		applicationContext.close();

	}
}
