package com.nt.training.Teacher;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class TeacherService {
	
	private final TeacherRepository teacherRepository;
	
	@Autowired
	public TeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}


	public List<Teacher> getTeacher() {
		return teacherRepository.findAll();
	}

	
	public void addNewTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Optional<Teacher> teacherOptional = teacherRepository.findTeacherBySubject(teacher.getSubject()); 
		if(teacherOptional.isPresent()) {
			throw new IllegalStateException("subject taken");
		}
		teacherRepository.save(teacher);
//		System.out.println(teacher);
		
	}


	public void deleteTeacher(Long teacherId) {
		// TODO Auto-generated method stub
		boolean exists = teacherRepository.existsById(teacherId);
		if(!exists) {
			throw new IllegalStateException( "teacher with id "+teacherId+" does not exist");
		}
		teacherRepository.deleteById(teacherId);
	}

	@Transactional
	public void updateTeacher(Long teacherId, String name, String subject) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherRepository.findById(teacherId).orElseThrow(() -> new IllegalStateException("teacher with id "+teacherId + "does not exist"));
		
		if (name!=null && name.length() > 0 && !Objects.equals(teacher.getName(), name)) {
			teacher.setName(name);
		}
		if (subject!=null && subject.length() > 0 && !Objects.equals(teacher.getSubject(), subject)) {
			teacher.setSubject(subject);
	}
	}
}
