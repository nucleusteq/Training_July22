package com.mt.training.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


	@Configuration
	@ComponentScan
	public class SpringConfig {
		@Bean
		public School school(){
			return new School("NucleusTeq",new Student(1,"Parth Waghela"),new Teacher(1,"Sandeep Jain"));
			
		}	
}