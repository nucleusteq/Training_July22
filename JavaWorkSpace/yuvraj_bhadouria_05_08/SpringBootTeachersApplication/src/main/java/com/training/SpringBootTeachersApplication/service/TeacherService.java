package com.training.SpringBootTeachersApplication.service;

import java.util.List;

import com.training.SpringBootTeachersApplication.domain.Teacher;



 public interface TeacherService {
	 public List<Teacher> getAllTeacher();
		public Teacher saveTeacher(Teacher teacher) ;
		public String deleteTeacher(Integer id);
		public Teacher updateTeacher(Integer id, Teacher teacher);
		public Teacher getTeacherById(Integer id);
}
