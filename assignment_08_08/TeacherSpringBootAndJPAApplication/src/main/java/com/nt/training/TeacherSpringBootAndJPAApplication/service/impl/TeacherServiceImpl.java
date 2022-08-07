package com.nt.training.TeacherSpringBootAndJPAApplication.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.TeacherSpringBootAndJPAApplication.entity.Teacher;
import com.nt.training.TeacherSpringBootAndJPAApplication.repository.TeacherRepository;
import com.nt.training.TeacherSpringBootAndJPAApplication.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public Teacher addTeacher(Teacher teacher) {

		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {

		return teacherRepository.findAll();
	}

	@Override
	public String removeTeacherById(int id) {
		teacherRepository.deleteById(id);
		return "Teacher with the given id deleted";
	}

	@Override
	public Teacher getTeacherFromId(int id) {
		Optional<Teacher> result = teacherRepository.findById(id);

		Teacher teacher = null;

		if (result.isPresent()) {
			teacher = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + id);
		}

		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
	teacherRepository.save(teacher);
		return teacher;
	}

	@Override
	public List<Teacher> getTeacherFromFirstName(String firstName) {
		List<Teacher> teachers=teacherRepository.findAll();
		List<Teacher> firstNameTeachers=new ArrayList<Teacher>();
		for(Teacher teacher:teachers) {
			if(teacher.getFirstName().equalsIgnoreCase(firstName)) {
				firstNameTeachers.add(teacher);
			}
		}
		return firstNameTeachers;
	}

	@Override
	public List<Teacher> getTeacherFromLastName(String lastName) {
		List<Teacher> teachers=teacherRepository.findAll();
		List<Teacher> lastNameTeachers=new ArrayList<Teacher>();
		for(Teacher teacher:teachers) {
			if(teacher.getLastName().equalsIgnoreCase(lastName)) {
				lastNameTeachers.add(teacher);
			}
		}
		return lastNameTeachers;
	}

}
