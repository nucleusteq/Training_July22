package MultiThreading;
import java.util.*;

class fibonacci extends Thread{
	private int No ;

    public fibonacci(int No) {
        this.No = No;
    }
    
    @Override
    public void run() {
    	
    	int n1=0,n2=1,n3,i,count=No;    
    	 System.out.print(n1+" "+n2);
    	    
    	 for(i=2;i<count;++i) 
    	 {    
    	  n3=n1+n2;    
    	  System.out.print(" "+n3);    
    	  n1=n2;    
    	  n2=n3;    
    	 }    
        System.out.println("\nThread One Febonic Thread is Running");
    }
    
}

class ReverseNo extends Thread{
	private int No ;

    public ReverseNo(int No) {
        this.No = No;
    }
    
    @Override
    public void run() {
    	for (int i = No; i > 0; i--)
	        System.out.print( +i + " ");

	 System.out.println("\nThread Two Reverse Thread is Running");
    }
}

class SumofNo extends Thread{
	private int No ;

    public SumofNo(int No) {
        this.No = No;
    }
	
	 @Override
	    public void run() {
		 int sum = 0;  
	    	for(int i = 1; i <=No ; ++i)  
	    	{  
	    	sum = sum + i;  
	    	}  
	    	System.out.println("Thread Three Sum of Numbers is = " + sum);  
	    }
}
public class FebSumAndAddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to show all thread");  
		int no = sc.nextInt();
		fibonacci fib = new fibonacci(no);
		fib.start();
		 
		 ReverseNo rv = new ReverseNo(no);
		 rv.start();
		 
		 SumofNo sum = new SumofNo(no);
		 sum.start();

	}

}
