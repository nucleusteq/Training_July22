package com.nt.training.SpringBootApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.SpringBootApplication.domain.Student;
import com.nt.training.SpringBootApplication.repository.StudentRepository;
import com.nt.training.SpringBootApplication.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}

	@Override
	public Student saveStudent(Student student) {
		Student stu =studentRepository.saveStudent(student);
		return stu;
	}

	@Override
	public String deleteStudent(Integer id) {
		System.out.println("id:" + id);
		if(id !=null && id > 0) {
			System.out.println("To be deleted");
		return 	studentRepository.deleteStudent(id);
			
		}else {
			return "id not valid";
		}
	}

	@Override
	public Student updateStudent(Integer id, Student student) {
		// TODO Auto-generated method stub
		return studentRepository.updateStudent(id, student);
	}

	@Override
	public List<Student> getStudentByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentByFirstName(firstName);
	}

}