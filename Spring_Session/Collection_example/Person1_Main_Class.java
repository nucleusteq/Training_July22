package com.Spring.collection.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Person1_Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		Person1 st =(Person1) applicationContext.getBean("Person1");
		System.out.println(st);
		
		applicationContext.close();

	}
	}


