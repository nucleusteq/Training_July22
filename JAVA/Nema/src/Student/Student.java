package Student;

public class Student{

    int rollnumber,marks1,marks2,marks3,total,avg;

    String name,course;

    char grade;

    public void setRollnumber(int rollnumber){
        this.rollnumber=rollnumber;

    }
    public void setMarks1(int marks1){
        this.marks1=marks1;

    }
    public void setMarks2(int marks2){
        this.marks2=marks2;

    }
    public void setMarks3(int marks3){
        this.marks3=marks3;

    }
    public void setName(String name){
        this.name=name;

    }
    public void setCourse(String course){
        this.course=name;

    }
    public int getRollnumber(){
        return rollnumber;

    }
    public int getMarks1(){
        return marks1;
        
    }
    public int getMarks2(){
        return marks2;

    }
    public int getMarks3(){
        return marks3;

    }
    public String getName(){
        return name;

    }
    public String getCourse(){
        return course;

    }
    public int calculateTotal(int marks1,int marks2,int marks3){
        total=marks1+marks2+marks3;
        System.out.println(total);
        return total;
    }
    public int calculateAverage(int total){
        avg=total/3;
        return avg;
    }
    public char calculateGrade(int avg)
    {
        System.out.println(avg);
        if(avg>80 && avg<=100){
            grade ='A';
            return grade;
        }
        else if(avg>60 && avg<=80){
            grade='B';
            return grade;
         
        }
        else if(avg>40 && avg<=60){
            grade='C';
            return grade;
        }
        else if(avg>20 && avg<=40){
            grade='D';
            return grade;
        }
        else{
            grade='F';
            return grade;
            
        }
        
    }
    public String toString()
    {
        return name+ "rollnumber is " + rollnumber+ " and total is " +total+ "and average is " +avg + "and grade is " +grade;
    }

}
