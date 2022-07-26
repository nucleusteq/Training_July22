package trainingday2;

class Students{
	private int rollno, marks1, marks2, marks3;
	private String name, course;
	private char grade;
	public Students(int rollno ,String name,String course,int marks1,int marks2,int marks3){
        setRollNumber(rollno);
        setName(name);
        setCourse(course);
        setMarks1(marks1);
        setMarks2(marks2);
        setMarks3(marks3);
    }
	public void setRollNumber(int rollno) {
		this.rollno = rollno;
	}
	private int getRollNumber() {
		return rollno;
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
	        return rollno+" "+name+" "+course+" "+ grade;
	       }
}
public class Taskforinterface{
    public static void main(String[] args) {
        Students s1[] = new Students[5];
        s1[0] = new Students(1,"Shreya","BCA",42,67,56);
        s1[1] = new Students(2,"Shreyansh","MBA",52,82,90);
        s1[2] = new Students(3,"Shreyas","MSC",63,65,98);
        s1[3] = new Students(4,"Simran","BSC",70,45,67);
        s1[4] = new Students(5,"Sikhar","BBA",89,85,96);
        for(int i=0 ; i<5 ; i++)
        {
            s1[i].calculateGrade();
            System.out.println(s1[i]);
        }
    }
}