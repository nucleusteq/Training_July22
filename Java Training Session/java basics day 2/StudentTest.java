
public class StudentTest {
    public static void main(String[] args) {
        Students s1= new Students();
        s1.setRollnumber(1);
        s1.setMarks1(90);
        s1.setMarks2(95);
        s1.setMarks3(97);
        s1.setName("piyush");
        s1.setCourse("maths");
        int total =s1.calculateTotal(90,95,97);
        s1.calculateAverage(total);
        System.out.println("value of first student is " +s1 );

    }
    
}
