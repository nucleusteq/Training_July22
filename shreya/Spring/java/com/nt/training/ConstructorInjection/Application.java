package com.nt.training.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bean-Config-Constructor.xml");
		Office officee=(Office)applicationContext.getBean("officee");
		System.out.println(officee);
		applicationContext.close();
	}
}