package com.nt.training.SpringBootApplication.service;

import java.util.List;

import com.nt.training.SpringBootApplication.domain.TeacherDomain;


public interface TeacherService {
	
	public List<TeacherDomain> getAllTeacher();
	public TeacherDomain addTeacher(TeacherDomain teacher) ;
	public String deleteTeacher(Integer id);
	public TeacherDomain updateTeacher(Integer id, TeacherDomain teacher);
	public List<TeacherDomain> getTeacherBySubject(String specialization);

}
