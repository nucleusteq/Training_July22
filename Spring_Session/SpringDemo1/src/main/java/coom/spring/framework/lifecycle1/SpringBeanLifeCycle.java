package coom.spring.framework.lifecycle1;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.Person;


public class SpringBeanLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfigration.xml");
		AwareBeanImp st =(AwareBeanImp) applicationContext.getBean("AwareBeanImp");
		System.out.println(st);
		
		//applicationContext.close();
	//	SpringApplication.run(AwareBeanImp.class, args);
		ApplicationContext context1 =
				new ClassPathXmlApplicationContext("beanConfigration.xml");
				AwareBeanImp awareBeanImpl = (AwareBeanImp) context1.getBean("AwareBeanImp");
				((AbstractApplicationContext) context1).registerShutdownHook();

	}

	

}
