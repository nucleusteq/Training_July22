package com.Practice.Setter.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Execute_Student_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		Student s =(Student) applicationContext.getBean("Student");
		System.out.println(s);
		
		applicationContext.close();

	}

}
