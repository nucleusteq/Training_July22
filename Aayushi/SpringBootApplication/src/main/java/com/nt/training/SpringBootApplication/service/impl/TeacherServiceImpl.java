package com.nt.training.SpringBootApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.repository.TeacherRepository;
import com.nt.training.SpringBootApplication.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository teacherRepository;
	
	@Override
	public List<Teacher> getAllTeacher() {
		return teacherRepository.getAllTeacher();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		Teacher stu =teacherRepository.saveTeacher(teacher);
		return stu;
	}

	@Override
	public String deleteTeacher(Integer id) {
		System.out.println("id:" + id);
		if(id !=null && id > 0) {
			System.out.println("To be deleted");
		return 	teacherRepository.deleteTeacher(id);
			
		}else {
			return "id not valid";
		}
	}

	@Override
	public Teacher updateTeacher(Integer id, Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.updateTeacher(id,teacher);
	}

	@Override
	public List<Teacher> getTeacherByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return teacherRepository.getTeacherByFirstName(firstName);
	}

}