package com.nt.training.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("Bean-Config-Setter.xml");
		Office office = (Office) applicationContext.getBean("office");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(office);	
		System.out.println(employee);	

		applicationContext.close();
	}
}
