package com.spring.firsst.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SchoolMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanSetter.xml");
	      studdent obj = (studdent) context.getBean("student");
	     // obj.getMessage();
	      System.out.println(obj);
	      //context.registerShutdownHook();

	}

}
