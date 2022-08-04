package com.nt.training.constructor.setterinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


	@Configuration
	@ComponentScan
	public class SpringConfig {
		@Bean
		public School school(){
			return new School("Choithram",new Student(1,"Shreya"),new Teacher(1,"Sejal"));
			
		}	
}
