package Multithreading;

public class ThreadSum extends Thread{
	int no;
	ThreadSum(int no){

		this.no = no;
	}
    public void run() {
    	System.out.println("The sum is ");
    	no=0;
		int sumofno;
		
	   for(int i=1; i<=10;i++){
	   no=no+i;
			
		}
	   System.out.println("Sum of 10 Numbers is:" +no);
    }

}