package trainingday2;

class School{
	private static School obj1=null;
	private int girls,boys,teachers,workers;
	private School() {}
	public int getGirls() {
		return girls;
	}
	public void setGirls(int girls) {
		this.girls = girls;
	}
	public int getBoys() {
		return boys;
	}
	public void setBoys(int boys) {
		this.boys = boys;
	}
	public int getTeachers() {
		return teachers;
	}
	public void setTeachers(int teachers) {
		this.teachers = teachers;
	}
	public int getWorkers() {
		return workers;
	}
	public void setWorkers(int workers) {
		this.workers = workers;
	}
	public int totalMembersInSchool() {
		int totalMembers = this.girls+this.boys+this.teachers+this.workers;
		return totalMembers;
	}
	public static School getInstance() {
		if(obj1==null) {
			obj1=new School();
		}
		return obj1;
	}
}
public class Singleton {
	public static void main(String[] args) {
		School obj1 = School.getInstance();
		obj1.setGirls(25);
		obj1.setBoys(35);
		obj1.setTeachers(10);
		obj1.setWorkers(15);
		
		System.out.println(obj1.totalMembersInSchool());
	}
}
