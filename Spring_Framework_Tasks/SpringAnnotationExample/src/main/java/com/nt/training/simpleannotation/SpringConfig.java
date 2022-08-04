package com.nt.training.simpleannotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {
	@Bean
	public School school(){
		return new School("SVM",new Student(1,"Sejal"),new Teacher("Shreya"));
		
	}
	
	


}
