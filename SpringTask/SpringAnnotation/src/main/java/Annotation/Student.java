package Annotation;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String Name;
	private Integer Id;
	
	public String getStName() {
		return Name;
	}
	public void setStName(String Name) {
		this.Name = Name;
	}
	public Integer getStId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String Name, Integer Id) {
		super();
		this.Name = Name;
		this.Id = Id;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Id=" + Id + "]";
	}
	
	
	
}