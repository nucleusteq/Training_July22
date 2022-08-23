package com.springAnnotationsLifeCycle;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;


	@Configuration
	// @ComponentScan("com.springAnnotationsLifeCycle")
	
	public class AnnotationLifeCycleConfig {
		@Bean
		public School school() {
			return new School();
			
		}
	}



