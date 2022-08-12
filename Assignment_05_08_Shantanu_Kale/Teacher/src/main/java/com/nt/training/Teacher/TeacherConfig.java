package com.nt.training.Teacher;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
public class TeacherConfig {
	@Bean
	CommandLineRunner clr(TeacherRepository repository) {
		return args -> {
					Teacher Raju = new Teacher(
							
							"Raju Ram",
							"Physics", 
							LocalDate.of(1980,12,20)
						
							);
					
					Teacher Shyam = new Teacher(
							
							"Shyam Mahajan",
							"Chemistry",
							LocalDate.of(1986,06,11)
							);
					repository.saveAll(List.of(Raju, Shyam));
		};
	}
	
}
