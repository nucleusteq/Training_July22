package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		Person st =(Person) applicationContext.getBean("Person");
		System.out.println(st);
		
		applicationContext.close();

	}

}
