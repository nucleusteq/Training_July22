package com.mt.training.LifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean, DisposableBean, BeanPostProcessor {
	private String name;

	public LifeCycleBean() {
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
		// TODO Auto-generated method stub
		System.out.println("afterProperties is getting called.");
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext is getting called");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory is getting called");
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName is getting called");
	}
	
}