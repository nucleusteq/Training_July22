package com.training.SpringBootTeachersApplication.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.training.SpringBootTeachersApplication.dao.TeachersDao;
import com.training.SpringBootTeachersApplication.domain.Teacher;

@Repository
public class ServiceImp implements TeacherService{
	@Autowired
	private TeachersDao teacherDao;
	//static List<Teacher> teachers;
	
	public ServiceImp() {
		//teachers = new ArrayList<Teacher>();
		
		//teachers.add(new Teacher(1, "teacher1" ,"1"));
		//teachers.add(new Teacher(2, "teacher2" ,"2"));
		//teachers.add(new Teacher(3, "teacher3" ,"3"));
	}
	
	@Override
	public List<Teacher> getAllTeacher() {
		
		return teacherDao.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		//teachers.add(teacher);
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public String deleteTeacher(Integer id) {
		/*System.out.println("Student id to deleted"+id);
		String s="";
		Iterator<Teacher> iterator = teachers.iterator();
		int index =0;
		for(int i = 0 ; i<teachers.size() ;i++) {
			Teacher teacher = teachers.get(i);
			if(teacher.getId() == id) {
				index = i;
			}
		}
		teachers.remove(index);
		s = "teacher deleted";
		
		return s;*/
		String s="";
		Teacher entity =teacherDao.getOne(id);
		teacherDao.delete(entity);
		s = "teacher deleted";
		return s;
		
		
	}

	@Override
	public Teacher updateTeacher(Integer id, Teacher teacher) {

		/*for(Teacher t : teachers) {
			if(t.getId() == id) {
				t.setFirstName(teacher.getFirstName());
				t.setLastName(teacher.getLastName());
				t.setId(id);
			}
		}
		return teacher;*/
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public Teacher getTeacherById(Integer id) {
		/*List<Teacher> filterTeacher = new ArrayList<Teacher>();
		for(Teacher teacher:teachers) {
			if(((Teacher) teacher).getFirstName().equals(firstName)) {
				filterTeacher.add((Teacher) teacher);
			}
		}
		
		
		return filterTeacher;*/
		return teacherDao.getById(id);
	}

}
