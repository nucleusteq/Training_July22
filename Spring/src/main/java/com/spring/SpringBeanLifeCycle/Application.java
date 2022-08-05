package com.spring.SpringBeanLifeCycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext tempObj  = new 
					ClassPathXmlApplicationContext("beanLifeCycle.xml");
			BeanLifeCycle sch = (BeanLifeCycle) tempObj.getBean("BLC");
		      System.out.println(sch);
		    tempObj.registerShutdownHook();
		}
	}
