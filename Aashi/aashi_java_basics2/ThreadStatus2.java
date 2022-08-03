package Mythread;
import java.util.Set;
class ThreadStatus2 implements Runnable {
  public void run()
  {  
	  try {  
  
		  Thread.sleep(2000);
	  }   
      catch(Exception e)
	  { System.out.println(e);
      }
  }
  
  public static void main(String args[])throws Exception
  { Thread t = new Thread(new ThreadStatus2());
    t.setName("my thread");
    t.start();
    System.out.println("Thread Status:"+ t.getState());
}
}