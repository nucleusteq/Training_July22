package com.nt.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	
public static void main(String[] args) {
	AnnotationConfigApplicationContext anoObj = new AnnotationConfigApplicationContext(ConfigFile.class);
	School sc  = anoObj.getBean(School.class);
	System.out.println(sc);
	anoObj.registerShutdownHook();
}
}
