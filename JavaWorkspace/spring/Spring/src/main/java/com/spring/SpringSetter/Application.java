package com.spring.SpringSetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext tempObj  = new 
					ClassPathXmlApplicationContext("beanSetter.xml");
			StudentSetter sch = (StudentSetter) tempObj.getBean("studentSet");
		      System.out.println(sch);
		}
	}
