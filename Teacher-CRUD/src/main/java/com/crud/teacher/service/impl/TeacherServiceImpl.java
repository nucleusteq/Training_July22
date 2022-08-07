package com.crud.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.teacher.domain.Teacher;
import com.crud.teacher.repository.TeacherRepository;

@Service
public class TeacherServiceImpl {

	
	@Autowired
	TeacherRepository teacherRepository;
	public Teacher saveTeacher(Teacher teacher) {
		Teacher tea= teacherRepository.saveTeacher(teacher);
		return tea;
	}
	
	public List<Teacher> getAllTeacher() {
		return teacherRepository.getAllTeacher();
	}
	
	public String deleteTeacher(Integer id) {
		System.out.println("id:" + id);
		if(id !=null && id > 0) {
			System.out.println("To be deleted");
		return 	teacherRepository.deleteTeacher(id);
			
		}else {
			return "id not valid";
		}
	}
	
	public Teacher updateTeacher(Integer id, Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.updateTeacher(id, teacher);
	}
	
	
	
}
