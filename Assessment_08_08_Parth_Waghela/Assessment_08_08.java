package Assessment_08_08;
class Thread3 extends Thread{
	public void run() {
		// Interval is 1 minute
		 for (int i =1 ; i<=60 ; i++) {
			   System.out.println("Temperature of Indore is 25 in  " + i + "minute");
			 
		   }; 
		 
	}
}
class Thread2 extends Thread {
	public void run() {
		// Interval is 1 minute
		 for (int i =1 ; i<=60 ; i++) {
			   System.out.println("Temperature of Ujjain is 23 in " + i + "minute");
		   }; 
		   
}}
public class Assessment_08_08 extends Thread{
	 public void run() {
		// Interval is 1 minute
		   for (int i =1 ; i<=60 ; i++) {
			   System.out.println("Temperature of Mumbai is 28 in " + i + "minute");};
		
	   }
   public static void main(String args[]) {
	   Assessment_08_08 T1=new Assessment_08_08();
	   T1.start();
	   Thread2 T2= new Thread2();
	   T2.start();  
	   Thread3 T3 =new Thread3();
	   T3.start();
   }
}
