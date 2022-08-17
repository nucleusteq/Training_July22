package com.mt.training.springBeanLifeCycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("Post Process Before Initialization method is called : Bean Name " + beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName){
		System.out.println("Post Process After Initialization method is called : Bean Name " + beanName);
		return bean;
	}
}
