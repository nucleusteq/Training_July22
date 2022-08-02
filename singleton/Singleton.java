package demo;

public class Singleton {

	
	public static void main(String[] args) {
		School sc = School.getInstance();
		sc.setBoys(40);
        sc.setGirls(30);
        sc.setTeachers(6);
        sc.setWorkers(15);

		System.out.println(sc.totalMembersInSchool());
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	class School{
	    private int girls;
		private int boys;
		private int teachers;
		private int workers;
		
		private static School
		School =null;

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
