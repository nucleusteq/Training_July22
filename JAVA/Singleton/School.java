package Singleton;

class School{
    private int girls;
	private int boys;
	private int teachers;
	private int workers;
	
	private static School School =null;
​
    private School() {
		
	}
	
	public void setGirlsNumber(int girls) {
		this.girls = girls;
	}
	
	public int getGirlsNumber() {
		return girls;
	}
​
	public int getBoysNumber() {
		return boys;
	}
​
	public void setBoysNumber(int boys) {
		this.boys = boys;
	}
​
	public int getTeachersNumber() {
		return teachers;
	}
​
	public void setTeachersNumber(int teachers) {
		this.teachers = teachers;
	}
​
	public int getWorkersNumber() {
		return workers;
	}
​
	public void setWorkersNumber(int workers) {
		this.workers = workers;
	}
	
	
	 public  int totalMembersInSchool() {
		int totalMembersInSchool = this.boys+this.girls+this.workers+this.teachers;
		return totalMembersInSchool;
	}
	public static School getInstance() {
		if(School==null) {
			School = new School();
		}
		return School;
	}
	
}
public class Singleton{
	public static void main(String[] args) {
		School sc = School.getInstance();
		sc.setBoysNumber(40);
        sc.setGirlsNumber(30);
        sc.setTeachersNumber(6);
        sc.setWorkersNumber(15);
​
		System.out.println(sc.totalMembersInSchool());
		
	}
}