package com.spring.firsst.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructInjectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanCons.xml");
	      Employee sch = (Employee) context.getBean("School");
	      sch.getEmpId();
	      sch.getName();


	}

}
