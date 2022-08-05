package com.nt.training3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String []args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Main_Scope_config.class);	
		Employee emp =(Employee) applicationContext.getBean(Employee.class);
		emp.setName("Here we Set name like : Prakriti");
		
		
		System.out.println(emp);
		Employee emp1 =(Employee) applicationContext.getBean(Employee.class);
		System.out.println(emp1);
	
		applicationContext.close();
	}
}
