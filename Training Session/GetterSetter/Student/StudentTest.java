
public class StudentTest {
    public static void main(String[] args) {
        int total,avg;
        Students s1= new Students();
        s1.setRollnumber(1);
        s1.setMarks1(90);
        s1.setMarks2(95);
        s1.setMarks3(97);
        s1.setName("piyush");
        s1.setCourse("maths");
        total =s1.calculateTotal(90,95,97);
        avg= s1.calculateAverage(total);
        s1.calculateGrade(avg);
        System.out.println("Details of  student is " +s1 );

        Students s2= new Students();
        s2.setRollnumber(2);
        s2.setMarks1(70);
        s2.setMarks2(70);
        s2.setMarks3(70);
        s2.setName("YUVRAJ");
        s2.setCourse("maths");
        total =s2.calculateTotal(70,70,70);
        avg=s2.calculateAverage(total);
        s2.calculateGrade(avg);
        System.out.println("Details of student is " +s2 );

        Students s3= new Students();
        s3.setRollnumber(3);
        s3.setMarks1(50);
        s3.setMarks2(50);
        s3.setMarks3(50);
        s3.setName("ayush");
        s3.setCourse("maths");
        total =s3.calculateTotal(50,50,50);
        avg=s3.calculateAverage(total);
        s3.calculateGrade(avg);
        System.out.println("Details of student is " +s3 );

        Students s4= new Students();
        s4.setRollnumber(4);
        s4.setMarks1(30);
        s4.setMarks2(30);
        s4.setMarks3(30);
        s4.setName("prakriti");
        s4.setCourse("maths");
        total =s4.calculateTotal(30,30,30);
        avg=s4.calculateAverage(total);
        s4.calculateGrade(avg);
        System.out.println("Details of student is " +s4 );

        Students s5= new Students();
        s5.setRollnumber(5);
        s5.setMarks1(10);
        s5.setMarks2(10);
        s5.setMarks3(10);
        s5.setName("Himanshu");
        s5.setCourse("maths");
        total =s5.calculateTotal(10,10,10);
        avg=s5.calculateAverage(total);
        s5.calculateGrade(avg);
        System.out.println("Details of  student is " +s5 );

    }
    
}
