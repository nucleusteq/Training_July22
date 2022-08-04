package com.nt.training.constructorBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("Constructor-Bean-Config.xml");
		ConstructorInjection order = context.getBean("order",ConstructorInjection.class);
		order.show_order();
	}
}
