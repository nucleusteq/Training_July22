package com.mt.training.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("constructorBeanConfig.xml");
		School schooll=(School)applicationContext.getBean("schooll");
		System.out.println(schooll);
		applicationContext.close();
	}

}
