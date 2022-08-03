package com.mt.training.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("setterBeanConfig.xml");
		School school=(School)applicationContext.getBean("school");
		Student student=(Student)applicationContext.getBean("student");
		System.out.println(school);
		System.out.println(student);
		applicationContext.close();
	}

}
