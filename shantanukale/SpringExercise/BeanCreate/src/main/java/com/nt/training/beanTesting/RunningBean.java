package com.nt.training.beanTesting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunningBean {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("firstBeans.xml");
		TestBean tb = (TestBean) appContext.getBean("tb");
		System.out.println(tb);
		
		appContext.close();
	}
}
//Give apt. names for your files. Make sure of the naming conventions. Use - in xml file.