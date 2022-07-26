package student;
import java.util.*;

class Student_Test{
	int rollNumber;
    String course;
    int marks1;
    int  marks2;
    int  marks3;
    int total;
    int avg;
    char grade;

    Student_Test(int rollNumber,String course, int marks1, int marks2, int marks3){
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3= marks3;
    }

    public String toString(){
        return rollNumber +" "+course+" "+marks1+" "+marks2+" "+marks3;
    } 

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getMarks1() {
        return marks1;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
   

    void calculateTotal(){
        total = marks1 + marks2 + marks3;
        calculateAverage();
        


    }
    void calculateAverage(){
        avg = total/3;
        calculateGrade();

        
    }
    void calculateGrade(){
        if (avg >= 90){
            grade = 'A';
        }
        else if(avg >= 80){
            grade = 'B';

        }
        else if(avg >=70){
            grade = 'C';
        }
        else if(avg >=60){
            grade = 'D';
        }
        else if(avg >=50){
            grade = 'E';
        }
        else {
            grade = 'F';
        }
    System.out.println(grade);
        
    }
    
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter first student details");
		System.out.println("Showing all studetns grade");
		Student_Test s1 = new Student_Test(1,"math",78,35,50);
		Student_Test s2 = new Student_Test(2,"social",87,88,94);
		Student_Test s3 = new Student_Test(3,"scince",34,53,25);
		Student_Test s4 = new Student_Test(4,"hindi",87,45,78);
		Student_Test s5 = new Student_Test(5,"computer",98,54,86);
	     s1.calculateTotal();
	     s2.calculateTotal();
	     s3.calculateTotal();
	     s4.calculateTotal();
	     s5.calculateTotal();
	}

}
