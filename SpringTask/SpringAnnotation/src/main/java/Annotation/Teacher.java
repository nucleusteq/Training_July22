package Annotation;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private String Name;
	private Integer Id;
	public String getTeachName() {
		return Name;
	}
	public void setTeachName(String Name) {
		this.Name = Name;
	}
	public Integer getTeachId() {
		return Id;
	}
	public void setTeachId(Integer Id) {
		this.Id = Id;
	}
	@Override
	public String toString() {
		return "Teacher [Name=" + Name + ", Id=" + Id + "]";
	}
	public Teacher(String Name, Integer Id) {
		super();
		this.Name = Name;
		this.Id = Id;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}