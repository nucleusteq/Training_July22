package JavaTrainingSession.JavaMultiThreading;

// 1 2 3 4 5
public class MultiThread2 {
	static void reverse(int input)
	{
		int n = input;
		System.out.print("\nReverse series from "+n+" will be : \n"+n+" "+Thread.currentThread().getName()+"\n");
		while(n>0) {
			System.out.println(" "+(n-1)+" "+Thread.currentThread().getName());
			n--;
		}
		
	}	

}
