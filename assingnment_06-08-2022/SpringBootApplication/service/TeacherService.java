package com.nt.training.SpringBootApplication.service;

import java.util.ArrayList;
import java.util.List;
import com.nt.training.SpringBootApplication.domain.Teacher;

public interface TeacherService {

	
	
	public  default List<Teacher>getAllTeacher(){
		List<Teacher> teachers = new ArrayList<Teacher>();
		return teachers;
	}
}


