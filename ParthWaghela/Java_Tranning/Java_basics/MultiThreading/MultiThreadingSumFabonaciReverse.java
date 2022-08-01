import java.util.Scanner;

class Fabonaci extends Thread{
	int n;
	Fabonaci(int n){
		this.n=n;
	}
	public void run() {
		 int FirstTerm = 0, SecondTerm = 1;
		    System.out.println(" My finonacci series is : " +SecondTerm +"\n");
		    for(int i=2; i<=n; i++) {
		    	int nextTerm = FirstTerm + SecondTerm;
		    	System.out.println(" My finonacci series is : " +nextTerm +"\n");
		    	
		        FirstTerm=SecondTerm;
		        SecondTerm=nextTerm;
		    }
	}
}

 class Reverse extends Thread{
	int num;
	Reverse(int num){

		this.num = num;
	}
	public void run() 
	{
		System.out.println("Reversing list is ");
		 int FirstTerm = 0, SecondTerm = 1;
		    System.out.println("Reverse List is:");
		    for(int i=num; i>=0; i--) 
		    {
		    	System.out.println("Reverse Series Number: " +i);
	}	        
		    
		    }  
		}
 class Sum extends Thread{
		int num;
		Sum(int num){

			this.num = num;
		}
	    public void run() {
	    	System.out.println("The sum is ");
	    	num=0;
			int SumOfN;
			
		   for(int i=1; i<=10;i++){
		   num=num+i;
				
			}
		   System.out.println("Sum of 10 Numbers is:" +num);
	    }

	}
public class MultiThreadingSumFabonaciReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Fabonaci f=new Fabonaci(num);
		f.start();
		
		Reverse r=new Reverse(num);
		r.start();
		
		Sum s=new Sum(num);
		s.start();
	}
}
