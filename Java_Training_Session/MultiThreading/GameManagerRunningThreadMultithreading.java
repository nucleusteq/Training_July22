package MultiThreading;

//import java.util.Set;

public class GameManagerRunningThreadMultithreading {
	
	public static void main(String...args) throws Exception{
		ThreadGroup threadGroup=new ThreadGroup("Parent Thread Group");
		
		PiratesRunningThreadMultithreading pirate1=new PiratesRunningThreadMultithreading(threadGroup,"pirate1");
		PiratesRunningThreadMultithreading pirate2=new PiratesRunningThreadMultithreading(threadGroup,"pirate2");
		PiratesRunningThreadMultithreading pirate3=new PiratesRunningThreadMultithreading(threadGroup,"pirate3");
		PiratesRunningThreadMultithreading pirate4=new PiratesRunningThreadMultithreading(threadGroup,"pirate4");
		PiratesRunningThreadMultithreading pirate5=new PiratesRunningThreadMultithreading(threadGroup,"pirate5");
		
		PiratesRunningThreadMultithreading pirate6=new PiratesRunningThreadMultithreading(threadGroup,"pirate6");
		PiratesRunningThreadMultithreading pirate7=new PiratesRunningThreadMultithreading(threadGroup,"pirate7");
		PiratesRunningThreadMultithreading pirate8=new PiratesRunningThreadMultithreading(threadGroup,"pirate8");
		PiratesRunningThreadMultithreading pirate9=new PiratesRunningThreadMultithreading(threadGroup,"pirate9");
		PiratesRunningThreadMultithreading pirate10=new PiratesRunningThreadMultithreading(threadGroup,"pirate10");
		
		PiratesRunningThreadMultithreading pirate11=new PiratesRunningThreadMultithreading(threadGroup,"pirate11");
		PiratesRunningThreadMultithreading pirate12=new PiratesRunningThreadMultithreading(threadGroup,"pirate12");
		PiratesRunningThreadMultithreading pirate13=new PiratesRunningThreadMultithreading(threadGroup,"pirate13");
		PiratesRunningThreadMultithreading pirate14=new PiratesRunningThreadMultithreading(threadGroup,"pirate14");
		PiratesRunningThreadMultithreading pirate15=new PiratesRunningThreadMultithreading(threadGroup,"pirate15");
		
		PiratesRunningThreadMultithreading pirate16=new PiratesRunningThreadMultithreading(threadGroup,"pirate16");
		PiratesRunningThreadMultithreading pirate17=new PiratesRunningThreadMultithreading(threadGroup,"pirate17");
		PiratesRunningThreadMultithreading pirate18=new PiratesRunningThreadMultithreading(threadGroup,"pirate18");
		PiratesRunningThreadMultithreading pirate19=new PiratesRunningThreadMultithreading(threadGroup,"pirate19");
		PiratesRunningThreadMultithreading pirate20=new PiratesRunningThreadMultithreading(threadGroup,"pirate20");
		
		pirate1.start();
		pirate2.start();
		pirate3.start();
		pirate4.start();
		pirate5.start();
		
		pirate6.start();
		pirate7.start();
		pirate8.start();
		pirate9.start();
		pirate10.start();
		
		pirate11.start();
		pirate12.start();
		pirate13.start();
		pirate14.start();
		pirate15.start();
		
		pirate16.start();
		pirate17.start();
		pirate18.start();
		pirate19.start();
		pirate20.start();
		
		
		Thread.sleep(3000);
		
		//System.out.println(pirate1.getName()+" "+pirate1.getState());
//		System.out.println(pirate2.getName()+" "+pirate2.getState());
//		System.out.println(pirate3.getName()+" "+pirate3.getState());
//		System.out.println(pirate4.getName()+" "+pirate4.getState());
//		System.out.println(pirate5.getName()+" "+pirate5.getState());
        System.out.println(threadGroup.activeCount());
        
        Thread[] group = new Thread[threadGroup.activeCount()];
        int count = threadGroup.enumerate(group);
        for (int i = 0; i < count; i++) 
        {
            System.out.println("Running Thread " + group[i].getName() + " found");
            System.out.println("Thread State " + group[i].getName() + " "+group[i].getState());
        }
        
//        Set<Thread> th=Thread.getAllStackTraces().keySet();
//        for(Thread t:th) {
//        	System.out.println(t.getName()+" "+t.getState());
//        }
	}
}
