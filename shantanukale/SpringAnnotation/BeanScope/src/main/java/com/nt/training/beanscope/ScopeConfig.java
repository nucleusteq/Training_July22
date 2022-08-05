package com.nt.training.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {
	@Bean
	@Scope(value = "prototype")
	public BeanScopeAnnotations b1() {
		return new BeanScopeAnnotations();
		
	}

}
