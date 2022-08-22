package JavaMultiThreading;
class MultiThread1 {
	static void Fibo(int input)
	{
		int i=0;
		int n=input;
		int First_term=0,Second_term=1,Temp_term;
		
		System.out.println("\nFibonacci series for "+n+" term is : \n"+First_term+" "+Thread.currentThread().getName());
		System.out.println(""+Second_term+" "+Thread.currentThread().getName());
		while(i<n-1) {
			Temp_term=First_term+Second_term;
			First_term=Second_term;
			Second_term=Temp_term;
			System.out.println(""+Temp_term+" "+Thread.currentThread().getName());
			i++;
		}		
	}	
}
