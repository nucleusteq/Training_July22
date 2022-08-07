package com.nt.training.SpringBootApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.training.SpringBootApplication.domain.TeacherDomain;
import com.nt.training.SpringBootApplication.repository.TeacherRepository;
import com.nt.training.SpringBootApplication.service.TeacherService;

@Service
public class TeacherServiceImple implements TeacherService{
	
	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public List<TeacherDomain> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.getAllTeacher();
	}

	@Override
	public TeacherDomain addTeacher(TeacherDomain teacher) {
		// TODO Auto-generated method stub
		TeacherDomain techer = teacherRepository.addTeacher(teacher);
		return techer;
	}

	@Override
	public String deleteTeacher(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("id:" + id);
		if(id !=null && id > 0) {
			System.out.println("To be deleted");
			return 	teacherRepository.deleteTeacher(id);
		}else {
			return "id not valid";
		}	
	}

	@Override
	public TeacherDomain updateTeacher(Integer id, TeacherDomain teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.updateTeacher(id, teacher);
	}

	@Override
	public List<TeacherDomain> getTeacherBySubject(String specialization) {
		// TODO Auto-generated method stub
		return teacherRepository.getTeacherBySubject(specialization);
	}
	
    
	

}
