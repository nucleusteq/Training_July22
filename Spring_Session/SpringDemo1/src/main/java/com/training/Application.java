package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		Student student =(Student) applicationContext.getBean("Student");
		System.out.println(student);
		
		applicationContext.close();

	}

}
