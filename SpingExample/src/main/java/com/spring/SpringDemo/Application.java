package com.spring.SpringDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext tempObj = new 
					ClassPathXmlApplicationContext("bean.xml");
		      Student sch = tempObj.getBean("student",Student.class);
		      System.out.println(sch);
		}
	}
