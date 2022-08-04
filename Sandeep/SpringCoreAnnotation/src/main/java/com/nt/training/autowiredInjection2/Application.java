package com.nt.training.autowiredInjection2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.nt.training.autowiredInjection.Config;

@Configuration
@ComponentScan(basePackages = "com.nt.training.autowiredInjection2")
public class Application {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Application.class);
		
	AirtelController airtelController =	applicationContext.getBean(AirtelController.class);
	System.out.println(airtelController);
	//airtelController.get
	JioController jioController=applicationContext.getBean(JioController.class);
	System.out.println(jioController);
	
	}
}

