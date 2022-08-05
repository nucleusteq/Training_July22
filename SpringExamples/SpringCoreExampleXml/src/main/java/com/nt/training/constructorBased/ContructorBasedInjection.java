package com.nt.training.constructorBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContructorBasedInjection {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("beanContructorInjection.xml");
			Office office = (Office) applicationContext.getBean("office");
			System.out.println(office);
			applicationContext.close();
	}
	
}
