package Oops_Programs;

class Test_Class {
   
    private static Test_Class single_instance = null;
 
    public int Girls;
    public int Boys;
    public int Teacher;
    public int Worker;
 
   
    private Test_Class()
    {
    	/*Girls = 25;
    	Boys = 50;
    	Teacher = 25;
    	Worker = 50;*/
       
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


	public static Test_Class Singleton()
    {
        if (single_instance == null) {
            single_instance = new Test_Class();
        }
        return single_instance;
    }
}

public class Singleton_School_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Class b = Test_Class.Singleton();
		b.setGirls(40);
		b.setBoys(20);
		b.setTeacher(10);
		b.setWorker(5);
		int x =  b.Boys+b.Girls+b.Teacher+b.Worker;
		System.out.println("Present Member in School is :- " +x);

	}

}
