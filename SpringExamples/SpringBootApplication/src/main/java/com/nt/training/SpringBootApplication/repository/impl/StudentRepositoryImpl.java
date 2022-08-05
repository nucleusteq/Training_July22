package com.nt.training.SpringBootApplication.repository.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.training.SpringBootApplication.domain.Student;
import com.nt.training.SpringBootApplication.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

	static List<Student> students;
	
	public StudentRepositoryImpl() {
		students = new ArrayList<Student>();
		
		students.add(new Student(1, "Sandeep" ,"Jain"));
		students.add(new Student(2, "Shreya" ,"Punjabi"));
		students.add(new Student(3, "Manav" ,"jindal"));
	}
	
	@Override
	public List<Student> getAllStudent() {
		
		return students;
	}

	@Override
	public Student saveStudent(Student student) {
		students.add(student);
		return student;
	}

	@Override
	public String deleteStudent(Integer id) {
		System.out.println("Student id to deleted"+id);
		String s="";
		Iterator<Student> iterator = students.iterator();
		int index =0;
		for(int i = 0 ; i<students.size() ;i++) {
			Student student = students.get(i);
			if(student.getId() == id) {
				index = i;
			}
		}
		students.remove(index);
		s = "student deleted";
		
		return s;
	}

	@Override
	public Student updateStudent(Integer id, Student student) {

		for(Student s : students) {
			if(s.getId() == id) {
				s.setFirstName(student.getFirstName());
				s.setLastName(student.getLastName());
				s.setId(id);
			}
		}
		return student;
	}

	@Override
	public List<Student> getStudentByFirstName(String firstName) {
		List<Student> filterStudent  = new ArrayList<Student>();
		for(Student student:students) {
			if(student.getFirstName().equals(firstName)) {
				filterStudent.add(student);
			}
		}
		
		
		return filterStudent;
	}

	
	
}
