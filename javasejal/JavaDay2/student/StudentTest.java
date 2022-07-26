package student;

public class StudentTest extends Student {
    public static void main(String[] args) {
        StudentTest s1 = new StudentTest();
        s1.name = "sejal";
        s1.rollNumber = 55;
        s1.marks1 = 80;
        s1.marks2 = 90;
        s1.marks3 = 87;
        System.out.print("Grade of " + s1.name + " is :");
        s1.calculateGrade(80, 90, 87);
        System.out.println();

        StudentTest s2 = new StudentTest();
        s2.name = "AAAA";
        s2.rollNumber = 15;
        s2.marks1 = 64;
        s2.marks2 = 82;
        s2.marks3 = 77;
        System.out.print("Grade of " + s2.name + " is :");
        s2.calculateGrade(64, 82, 77);
        System.out.println();
        StudentTest s3 = new StudentTest();
        s3.name = "BBBB";
        s3.rollNumber = 30;
        s3.marks1 = 40;
        s3.marks2 = 50;
        s1.marks3 = 67;
        System.out.print("Grade of " + s3.name + " is :");

        s3.calculateGrade(40, 50, 60);
        System.out.println();
        StudentTest s4 = new StudentTest();
        s4.name = "CCCC";
        s4.rollNumber = 55;
        s4.marks1 = 80;
        s4.marks2 = 90;
        s4.marks3 = 80;
        System.out.print("Grade of " + s4.name + " is :");
        s4.calculateGrade(80, 90, 80);
        System.out.println();
        StudentTest s5 = new StudentTest();
        s5.name = "DDDD";
        s5.rollNumber = 50;
        s5.marks1 = 80;
        s5.marks2 = 100;
        s5.marks3 = 97;
        System.out.print("Grade of " + s5.name + " is :");
        s5.calculateGrade(80, 90, 87);
        System.out.println();

    }

}
