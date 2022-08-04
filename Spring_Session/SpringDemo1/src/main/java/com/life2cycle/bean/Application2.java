package com.life2cycle.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanConfigration.xml");
			Cricket cricket=(Cricket)applicationContext.getBean("Cricket");
			System.out.println(cricket);
			applicationContext.close();
		
		}

	

}
