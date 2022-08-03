package com.spring.firsst.lifecylce;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
	      LifeCons obj = (LifeCons) context.getBean("Action");
	      obj.getMessage();
	      context.registerShutdownHook();

	}

}
