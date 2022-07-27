package student;
import java.util.Scanner;
public class StudenTest{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Student students[]=new Student[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter Roll Number");
			int rollNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name=sc.nextLine();
			System.out.println("Enter Course");
			String course=sc.nextLine();
			System.out.println("Enter Marks1");
			int marks1=sc.nextInt();
			System.out.println("Enter Marks2");
			int marks2=sc.nextInt();
			System.out.println("Enter Marks3");
			int marks3=sc.nextInt();
			students[i]= new Student(rollNumber,name,course,marks1,marks2,marks3);
			char grade=students[i].calculateGrade(marks1,marks2,marks3);
			students[i].setGrade(grade);
			System.out.println("Student Added");
		}
		System.out.println("Students Details");
		for(Student student:students){
			System.out.println(student);
		}
		
	}
}