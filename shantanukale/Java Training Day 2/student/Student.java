package student;
import java.lang.*;
import java.util.*;

class Students {
	private int rollNumber, marks1, marks2, marks3;
	private String name, course;
	private char grade;
	public Students(int rollNumber ,String name,String course,int marks1,int marks2,int marks3){
        setRollNumber(rollNumber);
        setName(name);
        setCourse(course);
        setMarks1(marks1);
        setMarks2(marks2);
        setMarks3(marks3);
    }
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	private int getRollNumber() {
		return rollNumber;
	}

	private int getMarks1() {
		return marks1;
	}

	private void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	private int getMarks2() {
		return marks2;
	}

	private void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	private int getMarks3() {
		return marks3;
	}

	private void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getCourse() {
		return course;
	}

	private void setCourse(String course) {
		this.course = course;
	}
	private char getGrade() {
		return grade;
	}
	private void setGrade(char grade) {
		this.grade = grade;
	}
	
	int calculateTotal(){
	    int total = marks1 + marks2+ marks3;
	    return total;
	    }
	float calculateAverage(){
	    float avg = calculateTotal()/3;
	    return avg;
	    }
	void calculateGrade(){
	    float avg = calculateAverage();
	    char stu_grade= ' ';
	    if (avg<50 && avg>=40)
	    {
	            stu_grade = 'E';
	    }
	    else
	    if(avg<60 && avg>=50)
	    {
	            stu_grade = 'D';
	    }
	    else
	    if(avg<70 && avg>=60)
	    {
	            stu_grade = 'C';
	       
	    }
	    else
	    if(avg<80 && avg>=70)
	    {
	            stu_grade = 'B';
	    }
	    else
	    if(avg<100 && avg>=80)
	    {
	            stu_grade = 'A';
	    }
	    setGrade(stu_grade);
	    }
	 public String toString(){
	        return rollNumber+" "+name+" "+course+" "+ grade;
	       }
}
public class Student{
    public static void main(String[] args) {
        Students s1[] = new Students[5];
        s1[0] = new Students(111,"Aastha","BBA",41,41,41);
        s1[1] = new Students(112,"Sayali","MBA",52,82,90);
        s1[2] = new Students(113,"Harirai","BCA",63,63,63);
        s1[3] = new Students(114,"Aman","BCA",74,74,74);
        s1[4] = new Students(115,"Himanshu","BCA",85,85,85);
        for(int i=0 ; i<5 ; i++)
        {
            s1[i].calculateGrade();
            System.out.println(s1[i]);
        }
    }
}
