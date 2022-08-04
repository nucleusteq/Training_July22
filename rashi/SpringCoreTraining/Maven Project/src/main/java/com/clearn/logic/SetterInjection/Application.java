package com.clearn.logic.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterBeanConfig.xml");
		Office office = (Office) applicationContext.getBean("office");
		System.out.println(office);
	}

}
