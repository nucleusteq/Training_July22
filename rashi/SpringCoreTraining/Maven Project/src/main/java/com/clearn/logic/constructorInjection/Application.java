package com.clearn.logic.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorBeanConfig.xml");
		Employee office = (Employee) applicationContext.getBean("employee");
		System.out.println(office);
	}
}
