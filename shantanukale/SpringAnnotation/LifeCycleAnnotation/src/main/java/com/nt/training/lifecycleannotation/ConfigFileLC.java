package com.nt.training.lifecycleannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFileLC {
	@Bean 
	public LifeCycleAnnotation lifecyc() {
		return new LifeCycleAnnotation("raman","engineering");
	}

	
	
	
}
