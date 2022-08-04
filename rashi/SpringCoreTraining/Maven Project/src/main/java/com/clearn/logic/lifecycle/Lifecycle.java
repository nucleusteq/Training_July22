package com.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Lifecycle implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean, DisposableBean, BeanPostProcessor{ 
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
	System.out.println("Set Beam is called");
	
}

public void afterPropertiesSet() throws Exception {
	System.out.println("After properties set is called");
	
}

public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	System.out.println("set application context is called");
	
}

public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	System.out.println("set Bean Factory is called");
}
	
}
