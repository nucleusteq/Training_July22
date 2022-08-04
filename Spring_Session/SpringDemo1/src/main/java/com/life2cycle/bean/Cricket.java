package com.life2cycle.bean;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Cricket implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean, DisposableBean {
			private int id;
			private String name;
			
			public Cricket(int id, String name) {
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
				System.out.println("Destroy method of Cricket called : Destroy ");
			}
			
			public void afterPropertiesSet(){
				System.out.println("afterPropertiesSet method of Cricket called : AfterPropertiesSet");
			}
			
			public void init() {
				System.out.println("  Init method called");
			}
			public Cricket() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			
		}	
			


