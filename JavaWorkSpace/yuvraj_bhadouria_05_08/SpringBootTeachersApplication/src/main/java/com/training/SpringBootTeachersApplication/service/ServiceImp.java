package com.training.SpringBootTeachersApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.SpringBootTeachersApplication.dao.TeachersDao;
import com.training.SpringBootTeachersApplication.domain.Teacher;

@Repository
public class ServiceImp implements TeacherService {
	@Autowired
	private TeachersDao teacherDao;

	public ServiceImp() {
	}

	@Override
	public List<Teacher> getAllTeacher() {

		return teacherDao.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public String deleteTeacher(Integer id) {

		String s = "";
		Teacher entity = teacherDao.getOne(id);
		teacherDao.delete(entity);
		s = "teacher deleted";
		return s;

	}

	@Override
	public Teacher updateTeacher(Integer id, Teacher teacher) {
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public Teacher getTeacherById(Integer id) {
		return teacherDao.getById(id);
	}

}
