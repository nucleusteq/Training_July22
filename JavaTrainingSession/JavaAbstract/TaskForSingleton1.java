package JavaTrainingSession.JavaAbstract;
class School{
	private static School school_obj =null;
	private int boys,girls,workers,teachers;
	private School() {

    }
	
    void setGirls(int girls) {
		this.girls = girls;
	}

    void setBoys(int boys) {
		this.boys = boys;
	}
	
    void setTeachers(int teachers) {
		this.teachers = teachers;
	}

    void setWorkers(int workers) {
		this.workers = workers;
	}

    int getGirls() {
		return girls;
	}

    int getBoys() {
		return boys;
	}
	
    int getTeachers() {
		return teachers;
	}
	
    int getWorkers() {
		return workers;
	}
	
    int totalMembersInSchool() {
		int total = teachers+workers+boys+girls;
		return total;
	}

	public static School createInstance() {
		if(school_obj == null) {
			school_obj = new School();
		}
		return school_obj ;
	}
}
public class TaskForSingleton1 {
	public static void main(String[] args) {
		School school_obj = School.createInstance();
		school_obj.setBoys(5);
		school_obj.setGirls(5);
		school_obj.setTeachers(3);
		school_obj.setWorkers(2);
		
		System.out.println(school_obj.totalMembersInSchool());
	}
}

