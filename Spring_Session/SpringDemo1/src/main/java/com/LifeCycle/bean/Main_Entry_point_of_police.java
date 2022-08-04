package com.LifeCycle.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main_Entry_point_of_police {

	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		Police p =(Police) applicationContext.getBean("Police");
		System.out.println(p);
		
		applicationContext.close();

	}
}
