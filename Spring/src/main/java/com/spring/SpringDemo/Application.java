package com.spring.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext tempObj  = new 
					ClassPathXmlApplicationContext("bean.xml");
		      Student sch = (Student) tempObj.getBean("student");
		      System.out.println(sch);
		}
	}
