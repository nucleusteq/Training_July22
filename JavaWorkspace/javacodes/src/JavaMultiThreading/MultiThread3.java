package JavaMultiThreading;

// 1 2 3 4 5
public class MultiThread3 {
	static void digitSum(int input)
	{
		int i=0,First_term = 1;
		int n = input;
		
		while(i<n-1) {
			First_term=First_term+i+2;
			i++;
		}
		System.out.print("\nSum of digit upto "+n+" is : "+First_term +" "+ Thread.currentThread().getName());
		System.out.println(" ");
	}	

}
