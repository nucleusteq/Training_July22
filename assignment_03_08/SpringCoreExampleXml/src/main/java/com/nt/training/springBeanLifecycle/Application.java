package com.nt.training.springBeanLifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("beanlifecycle-config.xml");
        Beanlifecycle b = (Beanlifecycle) context.getBean("Beanlifecycle");
        System.out.println(b);
        context.close();
}
}