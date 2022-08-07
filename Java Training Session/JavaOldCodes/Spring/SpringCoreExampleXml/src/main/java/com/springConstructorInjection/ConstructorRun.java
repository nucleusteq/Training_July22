package com.springConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorRun {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springConstructorInjection/ConstructorConfig.xml");
	CnstructorInject ci=(CnstructorInject) context.getBean("CnstructorInject");
	System.out.println(ci);
}

}
