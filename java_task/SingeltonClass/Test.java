package SingeltonClass;

class School {
    private int numberOfGirls;
    private int numberOfBoys;
    private int numberOfTeachers;
    private int numberOfWorkers;

    private static School school = null;

    private School() {

    }

    public void setNumberOfGirls(int numberOfGirls) {
        this.numberOfGirls = numberOfGirls;
    }

    public int getNumberOfGirls() {
        return numberOfGirls;
    }

    public void setNumberOfBoys(int numberOfBoys) {
        this.numberOfBoys = numberOfBoys;
    }

    public int getNumberOfBoys() {
        return numberOfBoys;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public int totalMemberInSchool() {
        int total = numberOfGirls + numberOfBoys + numberOfTeachers + numberOfWorkers;
        return total;
    }

    public static School getInstance() {
        if (school == null) {
            school = new School();
        }
        return school;
    }
}

public class Test {

    public static void main(String[] args) {
        School school = School.getInstance();
        school.setNumberOfGirls(20);
        school.setNumberOfBoys(17);
        school.setNumberOfTeachers(10);
        school.setNumberOfWorkers(8);
        System.out.println("Total number of members in a school are : " + school.totalMemberInSchool());
        School school1 = School.getInstance();
        School school2 = School.getInstance();

        System.out.println(school + " " + school1 + " " + school2);
    }
}