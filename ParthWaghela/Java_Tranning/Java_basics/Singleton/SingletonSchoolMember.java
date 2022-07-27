
class TestClass {
   
    private static Test_Class single_instance = null;
	public int Teacher;
    public int Worker;
    public int Girls;
    public int Boys;
   
	public int getTeacher() {
		return Teacher;
	}


	public void setTeacher(int teacher) {
		Teacher = teacher;
	}


	public int getWorker() {
		return Worker;
	}


	public void setWorker(int worker) {
		Worker = worker;
	}

    public int getGirls() {
		return Girls;
	}


	public void setGirls(int girls) {
		Girls = girls;
	}


	public int getBoys() {
		return Boys;
	}


	public void setBoys(int boys) {
		Boys = boys;
	}

	public static Test_Class Singleton()
    {
        if (single_instance == null) {
            single_instance = new Test_Class();
        }
        return single_instance;
    }
}

public class SingletonSchoolMember {

	public static void main(String[] args) {
		
		Test_Class b = Test_Class.Singleton();
		b.setGirls(14);
		b.setBoys(54);
		b.setTeacher(8);
		b.setWorker(11);
		int x =  b.Boys+b.Girls+b.Teacher+b.Worker;
		System.out.println("Present Member in School is :- " +x);

	}

}
