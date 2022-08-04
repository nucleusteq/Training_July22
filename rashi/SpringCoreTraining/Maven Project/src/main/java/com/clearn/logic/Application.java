package com.clearn.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("simpleBeamConfig.xml");
		EmployeeLogicImpl employee=(EmployeeLogicImpl)applicationContext.getBean("employee");
		System.out.println(employee);
	}
}
