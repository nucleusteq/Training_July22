package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunTest {

	public static void main(String[] args) {
		
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-config.xml");
		 Laptop L1 = (Laptop)context.getBean("L1");
		   System.out.println(L1);
	          context.registerShutdownHook();
		   
	}

}
