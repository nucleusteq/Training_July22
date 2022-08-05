package trainingday2;

public class Student{
	private int rollno;
	private String name;
	private String course;
	private int marks1;
	private int marks2;
	private int marks3;
	
	public Student(int rollno, String name, String course, int marks1, int marks2, int marks3)
	
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
	    return name;	
	}
	
	public void setCourse() {
		this.course=course;
	}
	
	public String getCourse(){
		return course;
	}
	
	public void setMarks1(int marks1){
		this.marks1=marks1;
	}
	
	public int getMarks1() {
		return marks1;
	}
	
	
	public void setMarks2(int marks2){
		this.marks2=marks2;
	}
	
	public int getMarks2() {
		return marks2;
	}
	
	public void setMarks3(int marks3){
		this.marks3=marks3;
	}
	
	public int getMarks3() {
		return marks3;
	}
	
	public int calculateTotal() {
		int total= getMarks1()+getMarks2()+ getMarks3();
		return total;
	}
	
	public calculateAvg() {
		float avg= calculateTotal()/3;
		return avg;	
	}
	
	public calculateGrade() {
		
		
	}
	
}




public class StudentTest {
    public static void main(String[]args){
    	Student s[]=new Student[5];
    	
    	s[0]=new Student(1,"Shreya","MSC",72,78,75);
    	s[1]=new Student(1,"Shruti","MSC",70,78,73);
    	s[2]=new Student(1,"Shreyas","MSC",72,70,65);
    	s[3]=new Student(1,"Shreyansh","MSC",66,88,75);
    	s[4]=new Student(1,"Simran","MSC",52,48,85);
    	
    	for(int i=0;i<5;i++)
    	{
    		s[i].calculateGrade();
    		System.out.println(s1[i]);
    	}
    }
}
