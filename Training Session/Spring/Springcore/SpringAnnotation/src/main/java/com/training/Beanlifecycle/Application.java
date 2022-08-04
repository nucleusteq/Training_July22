package com.training.Beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Lifecycleconfig.class);
		Office of = context.getBean(Office.class);
		System.out.println(of);
		context.close();
		
	}
}
