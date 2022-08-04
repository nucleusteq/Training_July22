package coom.spring.framework.lifecycle1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBeanImp implements ApplicationContextAware, BeanNameAware, BeanFactoryAware { 


	


	





public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("setBeanFactory method of AwareBeanImpl is called");
	System.out.println("setBeanFactory:: AwareBeanImpl singleton= "+ beanFactory.isSingleton("awareBean"));
	}
	
	


public void setBeanName(String name) {
	// TODO Auto-generated method stub
	System.out.println("setBeanName method of AwareBeanImpl is called");
	System.out.println("setBeanName:: Bean Name defined in context= "
	+ name);
	
}

public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("setApplicationContext method of AwareBeanImpl is called");
	System.out.println("setApplicationContext:: Bean Definition Names= "
	+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
	

}
