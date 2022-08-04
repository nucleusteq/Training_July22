package com.spring.SetterInjection;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

		public static void main(String[] args) {
			ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Setter-Config.xml");
			School school=(School)applicationContext.getBean("school");
			Student student=(Student)applicationContext.getBean("student");
			System.out.println(school);
			System.out.println(student);
			applicationContext.close();
		}

	}
	
