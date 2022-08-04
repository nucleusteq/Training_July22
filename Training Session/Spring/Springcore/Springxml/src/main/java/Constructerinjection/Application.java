package Constructerinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Constructorinject-config.xml");
	Constructerinject c = (Constructerinject) context.getBean("Constructerinject");
    System.out.println(c);
    
}
}