package com.SpringTeacher.SpringTeacher.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringTeacher.SpringTeacher.entities.Teacher;

@Service
public class TeacherServiceimpl implements TeacherService {
	
	List<Teacher> list;
	
	public TeacherServiceimpl() {
		list = new ArrayList<>();
		list.add(new Teacher(111, "Sandeep Jain", "Vijay Nagar"));
		list.add(new Teacher(121, "Prakriti gupta", "Palasia"));
		list.add(new Teacher(131, "Aditya", "LIG"));
	}
	

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Teacher getTeacher(long teacherId) {
		// TODO Auto-generated method stub
		Teacher t = null;
		for(Teacher teacher:list)
		{
			if(teacher.getId() == teacherId)
			{
				t = teacher;
				break;
			}
		}
		return t;
	}


	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		list.add(teacher);
		return teacher;
	}


	/*@Override
	public Teacher deleteTeacher(long teacherId) {
		// TODO Auto-generated method stub
		list.remove(teacherId);
		return (Teacher) list;
	}*/


/*	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		list.set(0, teacher);
		return teacher;
	}
*/
}
