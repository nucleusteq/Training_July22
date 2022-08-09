package com.spring.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Application {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Setter.xml");
	
			Student student=(Student)applicationContext.getBean("student");
			
			System.out.println(student);
			applicationContext.close();
		}
	}