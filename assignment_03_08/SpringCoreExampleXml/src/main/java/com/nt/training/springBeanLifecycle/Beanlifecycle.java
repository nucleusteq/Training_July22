package com.nt.training.springBeanLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Beanlifecycle implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean, DisposableBean, BeanPostProcessor {
	private String name;

	public Beanlifecycle() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Beanlifecycle [name=" + name + "]";
	}
	public void init() {
		System.out.println("Bean is initiating..");
	}
	public void destroy() {
		System.out.println("Bean is destroyed now.");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties Set method is being called.");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context method is being called.");

	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("After Properties Set method is being called.");

	}

	public void setBeanName(String name) {
		System.out.println("Set Bean Name method is being called.");

		
	}
}