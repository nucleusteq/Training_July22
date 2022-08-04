package com.nt.training.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApplication {
	public static void main(String[]args) {
		ApplicationContext newcontext = new ClassPathXmlApplicationContext("Setter-Application.xml");
		
		SetterCars car = (SetterCars)newcontext.getBean("car");
		car.result();
	}
}
