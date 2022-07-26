package student;
public class Student{

	private int rollNumber;
	private String name;
	private String course;
	private int marks1;
	private int marks2;
	private int marks3;
	private char grade;

	Student(){

	}
	public Student(int rollNumber,String name,String course,int marks1,int marks2,int marks3){
		 this.rollNumber=rollNumber;
		 this.name=name;
		 this.course=course;
		 this.marks1=marks1;
		 this.marks2=marks2;
		 this.marks3=marks3;
	}
	public void setRollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}
	public int getRollNumber(){
		return this.rollNumber;
	}

	public void setName(String name){
		this.name=name;	
	}
	public String getName(){
		return name;
	}
	
	public void setCourse(String course){
		this.course=course;
	}
	public String getCourse(){
		return course;
	}
	
	public void setMarks1(int marks1){
		this.marks1=marks1;
	}
	public int getMarks1(){
		return marks1;
	}
	

	public void setMarks2(int marks2){
		this.marks2=marks2;
	}
	public int getMarks2(){
		return marks2;
	}


	public void setMarks3(int marks3){
		this.marks3=marks3;
	}
	public int getMarks3(){
		return marks3;
	}

	public void setGrade(char grade){
		this.grade=grade;		
	}
	public char getGrade(){
		return grade;
	}

	
	public int calculateTotal(int marks1,int marks2,int marks3){
		int total=marks1+marks2+marks3;
		return total;
	}

	public double calculateAverage(int marks1,int marks2,int marks3){
		int total=this.calculateTotal(marks1,marks2,marks3);
		double average = total/3;
		return average;
	}

	public char calculateGrade(int marks1,int marks2,int marks3){
		int total=this.calculateTotal(marks1,marks2,marks3);
		double percentage=((double)total/300)*100;
		
		if(percentage >=90 && percentage <=100 ){
			return 'A';
		}
		else if(percentage >=80 && percentage <=89){
			return 'B';
		}
		else if(percentage >=70 && percentage <=79){
			return 'C';
		}
		else if(percentage >=60 && percentage <=69){
			return 'D';
		}
		else{
			return 'F';
		}
	}

	public String toString(){
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
		System.out.println("Course : "+course);
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Marks3 : "+marks3);
		System.out.println("Grade : "+grade);
		System.out.println("Average : "+this.calculateAverage(marks1,marks2,marks3));
		return "";
	}
}
