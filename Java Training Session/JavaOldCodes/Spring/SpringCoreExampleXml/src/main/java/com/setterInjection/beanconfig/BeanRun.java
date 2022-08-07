package com.traning.beanconfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfiguration.xml");
	      School school = (School) context.getBean("School");
	      School school1 = (School) context.getBean("School1");
	      System.out.println(school);
	      System.out.println(school1);
	      context.close();
	      
	}

}
