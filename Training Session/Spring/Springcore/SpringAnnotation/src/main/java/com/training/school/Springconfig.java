package com.training.school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class Springconfig {
@Bean
public Student student() {
	return new Student(1,"Yuvraj");
	}
@Bean
public Teacher teacher() {
	return new Teacher(10,"teacher");
}

}
