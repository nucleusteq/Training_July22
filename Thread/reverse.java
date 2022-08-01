package demo;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		          try
		          {
		              // Fibonacci fib = new Fibonacci();
		              // fib.start();
		              // fib.sleep(4000);
		               Rev rev = new Rev();
		               rev.start();
		          }
		          catch (Exception ex)
		          {
		               ex.printStackTrace();
		          }
		     }
		}

	






class Rev extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\n____________");
               System.out.println("\nReverse is: ");
               System.out.println("_____________________");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println("\n--------------------------------------\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}


