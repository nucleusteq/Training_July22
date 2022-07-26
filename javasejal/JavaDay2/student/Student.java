package student;

public class Student {
    int rollNumber, marks1, marks2, marks3;
    String name, course;

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    /**
     * @param m1
     * @param m2
     * @param m3
     */
    int calculateTotal(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        System.out.print("Total is : ");
        return total;

    }

    float calculateAverage(int m1, int m2, int m3) {
        float avg = (m1 + m2 + m3) / 3;
        System.out.print("Average  is : ");
        return avg;

    }

    void calculateGrade(int m1, int m2, int m3) {
        float avg = (m1 + m2 + m3) / 3;
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }

    }

}
