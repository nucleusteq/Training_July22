package com.nt.training.setterBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterInjectionApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("beanConfigSetter.xml");
			School school = (School) applicationContext.getBean("school");
			System.out.println(school);
			
			applicationContext.close();
	}

}
