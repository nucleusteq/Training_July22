package com.nt.training.lifeCycleBean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("bean-life.xml");
		LifeCycle beanlife = (LifeCycle) context.getBean("beanlife");
		System.out.println(beanlife);
	}
}
