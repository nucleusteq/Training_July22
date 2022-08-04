package com.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
 
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
		Lifecycle office = (Lifecycle) applicationContext.getBean("Action");
		System.out.println(office);
	}
}
