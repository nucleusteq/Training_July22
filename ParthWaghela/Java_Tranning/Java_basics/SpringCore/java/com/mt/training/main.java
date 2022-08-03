package com.mt.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		//private String message;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanCons.xml");
	      School sch = (School) context.getBean("School");
	      
	      	      System.out.println(sch.getId()+sch.getName());
	}

}
