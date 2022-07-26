package student;

public class Student {
	int rollNumber;
    String course;
    int marks1;
    int  marks2;
    int  marks3;
    int total;
    int avg;
    char grade;

    Student(int rollNumber,String course, int marks1, int marks2, int marks3){
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

