package com.spring.firsst.lifecylce;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCons implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean, DisposableBean, BeanPostProcessor  {
	   private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void init(){
	      System.out.println("Bean is initialted.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("SetBeanName is called :- "+name);
		
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("SetBeanFactory is called :- " + beanFactory);
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext is Called :- " + applicationContext);
		
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After Property Set is called");
		
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("Post Process Before Initialization is called : Bean Name " +bean+ beanName );
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName){
		System.out.println("Post Process After Initialization is called : Bean Name " +bean+ beanName);
		return bean;
	}
	}