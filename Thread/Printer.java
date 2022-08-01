package demo;

public class Printer {

	public static void main(String args[] )
	{
	   System.out.println("Application starts");	
	   System.out.println("  ");	
	   
	   xyz print = new xyz();
	 //  print.doc(20,"prakriti");
	   Mythread pra = new Mythread(print);
	  	pra.start();
	  	System.out.println("main thread closed");
	}
	
}



class Mythread extends Thread{
	xyz pr;
	
	Mythread(xyz p)
	{
		pr =p;
	}
	public void run()
	{
		 pr.doc(7, "happy profile.pdf");
	}	
}




class xyz{
void doc(int copies, String name) {
		
		for(int i=1;i<=copies;i++) {
			System.out.println("@printing   "+name+" "+i);
		}
	}
	
}