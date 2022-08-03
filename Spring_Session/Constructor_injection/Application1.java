package com.Practice.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		Employee stud =(Employee) applicationContext.getBean("Employee");
		System.out.println(stud);
		
		applicationContext.close();

	}
}
