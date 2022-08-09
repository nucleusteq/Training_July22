package com.spring.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConstructorInjection.xml");
		School school=(School)applicationContext.getBean("school");
		System.out.println(school);
		applicationContext.close();
	}

}