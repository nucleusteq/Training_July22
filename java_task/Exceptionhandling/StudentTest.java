package Exceptionhandling;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Roll Number");
            int rollNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name");
            String name = sc.nextLine();
            System.out.println("Enter Course");
            String course = sc.nextLine();
            System.out.println("Enter Marks1");
            int marks1 = sc.nextInt();
            System.out.println("Enter Marks2");
            int marks2 = sc.nextInt();
            System.out.println("Enter Marks3");
            int marks3 = sc.nextInt();

            // Illegal Argument Exception being thrown
            if (marks1 < 0 || marks2 < 0 || marks3 < 0 || marks1 > 100 || marks2 > 100 || marks3 > 100) {
                throw new IllegalArgumentException("Enter marks in the range of 0 to 100");
            }

            students[i] = new Student(rollNumber, name, course, marks1, marks2, marks3);
            char grade = students[i].calculateGrade(marks1, marks2, marks3);
            students[i].setGrade(grade);
            System.out.println("Student Added");
        }

        System.out.println("Please select a option from the below give one to view the details of students");
        System.out.println("1. Show details of some specific student");
        System.out.println("2. Show details of all students");
        System.out.println("Enter Choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter roll number to show details of some specific student: ");
                int rollNumber = sc.nextInt();
                StudentTest.specificStudentDetails(students, rollNumber);
                break;
            case 2:
                StudentTest.allStudentDetails(students);
                break;
            default:
                System.out.println("Invalid option selection");
                break;
        }
    }

    public static void specificStudentDetails(Student[] students, int rollNumber) {
        System.out.println("Students Details");
        Student student = new Student();
        // Null pointer exception being raised

        try {
            Student answer = student.getStudentFromRollNumber(students, rollNumber);
            System.out.println("Roll Number : " + answer.getRollNumber());
            System.out.println("Name : " + answer.getName());
            System.out.println("Course : " + answer.getCourse());
            System.out.println("Marks1 : " + answer.getMarks1());
            System.out.println("Marks2 : " + answer.getMarks2());
            System.out.println("Marks3 : " + answer.getMarks3());
            System.out.println("Grade : " + answer.getGrade());
        } catch (NullPointerException e) {
            System.out.println("No student found with the given roll number");
        }
    }

    public static void allStudentDetails(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}