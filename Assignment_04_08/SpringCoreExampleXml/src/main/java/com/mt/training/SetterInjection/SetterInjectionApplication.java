package com.mt.training.SetterInjection;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SetterInjectionApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("Bean-config-Setter.xml");
		Office office = (Office) applicationContext.getBean("office");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(office);	
		System.out.println(employee);	
		applicationContext.close();
	}
}