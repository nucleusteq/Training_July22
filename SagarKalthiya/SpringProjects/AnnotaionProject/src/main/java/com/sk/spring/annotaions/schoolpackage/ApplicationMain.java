package com.sk.spring.annotaions.schoolpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
         School college = context.getBean(School.class);
        /// college.test();
         System.out.println(college);
         context.close();

	}

}
