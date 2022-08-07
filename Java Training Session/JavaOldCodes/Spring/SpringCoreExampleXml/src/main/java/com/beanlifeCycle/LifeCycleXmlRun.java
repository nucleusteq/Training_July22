package com.beanlifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleXmlRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifeCycle/beanLifeCycleConfig.xml");
		LifeCycleXml lc=(LifeCycleXml)context.getBean("lc");
		System.out.println(lc);
		context.close();
	}

}
