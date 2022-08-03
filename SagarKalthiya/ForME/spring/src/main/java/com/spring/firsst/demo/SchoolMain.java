package com.spring.firsst.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanCons.xml");
	      School sch = (School) context.getBean("School");
	      sch.getMessage();

	}

}
