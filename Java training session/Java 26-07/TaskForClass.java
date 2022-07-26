
import java.lang.*;

class Student{
    private int rollNumber;
    private String name;
    private String course;
    private int marks1;
    private int marks2;
    private int marks3;
    private char mark;
    
    public Student(int rollNumber ,String name,String course,int marks1,int marks2,int marks3){
        setRollNumber(rollNumber);
        setName(name);
        setCourse(course);
        setMarks1(marks1);
        setMarks2(marks2);
        setMarks3(marks3);
    }

    void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;  
    }
    void setName(String name){
        this.name = name;
    }
    void setCourse(String course){
        this.course = course;
    }
    void setMarks1(int marks1){
        this.marks1 = marks1;
    }
    void setMarks2(int marks2){
        this.marks2 = marks2;
    }
    void setMarks3(int marks3){
        this.marks3 = marks3;
    }
    void setMark(char any)
    {
        this.mark = any;
    }
    

    int getRollNumber(){
        return rollNumber;
    }
    String getName(){
        return name;
    }
    String getCourse(){
        return course;
    }
    int getMarks1(){
        return marks1;
    }
    int getMarks2(){
        return marks2;
    }
    int getMarks3(){
        return marks3;
    }


    int calculateTotal(){
        int total = getMarks1() + getMarks2()+ getMarks3();
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
        setMark(stu_grade);
    }

    // Character mark = calculateGrade();
    public String toString(){
        return name+" "+rollNumber+" "+course+" "+ mark;  
       }  
}

class StudentTest{
    public static void main(String[] args) {

        Student s1[] = new Student[5];
        s1[0] = new Student(111,"Ayush","BCA",41,41,41);
        s1[1] = new Student(112,"Piyush","BCA",52,52,52);
        s1[2] = new Student(113,"Hari","BCA",63,63,63);
        s1[3] = new Student(114,"Arjun","BCA",74,74,74);
        s1[4] = new Student(115,"Himanshu","BCA",85,85,85);
       

        for(int i=0 ; i<5 ; i++)
        {
            s1[i].calculateGrade();
            System.out.println(s1[i]);
        }
    }
}
