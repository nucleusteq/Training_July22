package Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	
public static void main(String[] args) {
	AnnotationConfigApplicationContext obj = new AnnotationConfigApplicationContext(Config.class);
	School s  = obj.getBean(School.class);
	System.out.println(s);
	
     obj.registerShutdownHook();
}
}