package com.mt.training.LifeCycle;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("beanlifecycle-config.xml");
		LifeCycleBean b = (LifeCycleBean) context.getBean("LifeCycleBean");
        System.out.println(b);
        context.close();
}
}