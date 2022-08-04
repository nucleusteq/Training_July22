package Lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("beanlifecycle-config.xml");
    Beanlifecycle bl = (Beanlifecycle) context.getBean("Beanlifecycle");
    System.out.println(bl);
    context.close();
}
}
