package com.spring.SpringConstructor;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext tempObj  = new 
					ClassPathXmlApplicationContext("beanConstructor.xml");
			StudentConstructor sch = (StudentConstructor) tempObj.getBean("studentCon");
		      System.out.println(sch);
		}
	}
