package com.nt.training.SimpleBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
public static void main(String[] args) {
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean-Config.xml");
	Student student = (Student) applicationContext.getBean("student");
	System.out.println(student);	
}	
}
