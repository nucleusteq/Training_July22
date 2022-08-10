package Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	private String schoolName;
	private Teacher teacher;
	private Student student;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", teacher=" + teacher + ", student=" + student + "]";
	}
	
	@Autowired
	public School(Student student) {
		super();
		this.student = student;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}