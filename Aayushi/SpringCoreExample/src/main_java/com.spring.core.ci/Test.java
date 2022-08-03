package com.spring.core.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.training.SimpleBean.Student;

public class Test {
public static void main(String[] args) {
	
	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ci-config.xml");
	   Person person= (Person)applicationContext.getBean("person");
	   System.out.println(person);
	   
	
}
}
