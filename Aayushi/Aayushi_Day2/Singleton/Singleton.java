package interface_prgrm;

class School{
	private int girls,boys,teachers,workers;
	
	private static School School =null;

    private School() {
		
	}
	
	public void setGirls(int girls) {
		this.girls = girls;
	}
	
	public int getGirls() {
		return girls;
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
	
	
	 public  int totalMembers() {
		int totalMembers = this.boys+this.girls+this.workers+this.teachers;
		return totalMembers;
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
		School s = School.getInstance();
		s.setBoys(50);
        s.setGirls(32);
        s.setTeachers(10);
        s.setWorkers(20);

		System.out.println(s.totalMembers());
		
	}
}