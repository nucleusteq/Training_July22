package MultiThreading;




/*
public class BankingThread extends Thread {
	   private long[] t_balance; // acount balance
	   private long t_count; // number of transactions done so far
	   public BankingThread(ThreadGroup g, String n) {
	      super(g,n);
	      t_count = 0;
	      int m = BankingDemoATM.accountCount();
	      t_balance = new long[m];
	      for (int i=0; i<m; i++) t_balance[i] = 0;
	   }
	   public long transactionCount() {
	      return t_count;
	   }
	   public long getBalance(int i) {
	      return t_balance[i];
	   }
	   public void run() {
	      while (!isInterrupted()) {
	         t_count++; 
	         Random r = BankingDemoATM.getRandom();
	         long t_step = BankingDemoATM.getStep();
	         int m = BankingDemoATM.accountCount();
	         int n = r.nextInt(m); // account number
	         int t = 2*r.nextInt(2)-1; // type of transaction
	         long a = (long) t*r.nextInt(10000); // amount of transaction
	         if (t_step==1) 
	            if (BankingDemoATM.doTransaction1(n,a)) t_balance[n] += a;
	         if (t_step==2)
	            if (BankingDemoATM.doTransaction2(n,a)) t_balance[n] += a;
	         if (t_step==3)
	            if (BankingDemoATM.doTransaction3(n,a)) t_balance[n] += a;
	         if (t_step==4)
	            if (BankingDemoATM.doTransaction4(n,a)) t_balance[n] += a;
	         try {
	            sleep(10); // wait for the next customer
	         } catch (InterruptedException e) {
	            break;
	         }
	      }
	   }
	}*/