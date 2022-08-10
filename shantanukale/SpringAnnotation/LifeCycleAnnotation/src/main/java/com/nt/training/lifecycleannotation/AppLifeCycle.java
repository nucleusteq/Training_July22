package com.nt.training.lifecycleannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.training.newspringpractice.BeanConfig;

public class AppLifeCycle {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFileLC.class);
		LifeCycleAnnotation lca = context.getBean(LifeCycleAnnotation.class);
		System.out.println(lca);
		context.close();
	}
}
