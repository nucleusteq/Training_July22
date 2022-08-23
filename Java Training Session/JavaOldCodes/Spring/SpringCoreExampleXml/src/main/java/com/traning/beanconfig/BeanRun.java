package com.traning.beanconfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfiguration.xml");
	      School school = (School) context.getBean("School");
	      System.out.println(school);
	      context.close();
	      
	}

}
