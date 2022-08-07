package com.nt.training.SpringBootApplication.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.repository.TeacherRepository ;


@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

@Override
public List<Teacher>getAllTeacher(){
	List<Teacher> teachers = new ArrayList<Teacher>();
	

	teachers.add(new Teacher(1,"Kiran","Mai"));
	teachers.add(new Teacher(2,"Neha","Singh"));
	teachers.add(new Teacher(3,"Dolly","Sharma"));
	
	return teachers ;
}

}



	