package com.springAnnotationsLifeCycle;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationLifeCycle {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationLifeCycleConfig.class);
				School school =applicationContext.getBean(School.class);
		System.out.println(school);
		applicationContext.close();
		
	}

}



