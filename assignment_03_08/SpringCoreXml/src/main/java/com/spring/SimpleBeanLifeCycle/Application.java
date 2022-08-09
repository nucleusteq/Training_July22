package com.spring.SimpleBeanLifeCycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	public static void main(String...args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("StudentBeanLifeCycle.xml");
		Student student=(Student)applicationContext.getBean("student");
		System.out.println(student);
		applicationContext.close();
	}
}