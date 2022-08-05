package com.spring.SimpleBeanLifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import java.util.Arrays;

public class Student implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean, DisposableBean {
	private int id;
	private String name;
	public Student() {
		System.out.println("Constructor of Student Class Called");
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public void setBeanName(String beanName) {
		System.out.println("setBeanName method of BeanNameAware is called");
		System.out.println("BeanName is : "+beanName);
	}
	
	public void setBeanFactory(BeanFactory beanFactory) {
		System.out.println("setBeanFactory method of BeanFactoryAware is called " +beanFactory.getClass());
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) {
		System.out.println("setApplicationContext method of ApplicationContextAwarer is called "+Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
	
	public void destroy(){
		System.out.println("Destroy method of Student called ");
	}
	
	public void afterPropertiesSet(){
		System.out.println("afterPropertiesSet method of Student called ");
	}
	
	public void customInit() {
		System.out.println("Custom Init method called");
	}
	
	public void customDestroy() {
		System.out.println("Custom method called");
	}
}