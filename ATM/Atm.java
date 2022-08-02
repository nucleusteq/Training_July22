package Shape;



class Atm {

	
	static int total_balance = 100;

	static synchronized void withdrawn(String name,
									int withdrawal)
	{
		if (total_balance >= withdrawal) {
			System.out.println(name + " withdrawn from Atm "+ withdrawal);
			total_balance = total_balance - withdrawal;
			System.out.println("Balance after withdrawal From Atm: "+ total_balance);
		
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	
		else {
			System.out.println(name+ " you can not withdraw From Atm "+ withdrawal);
			System.out.println("your balance is : " + total_balance);

			try {

				
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {

				
				e.printStackTrace();
			}
		}
	}


	static synchronized void deposit(String name,
									int deposit)
	{
		System.out.println(name + " deposited " + deposit);
		total_balance = total_balance + deposit;
		System.out.println("Balance after deposit: "+ total_balance);

		
		try 
		{

		
			Thread.sleep(1000);
		}

		
		catch (InterruptedException e)
		{

			e.printStackTrace();
		}
	}
}

class Thread_Withdrawal extends Thread {
	Atm object;
	String name;
	int rs;


	Thread_Withdrawal(Atm ob, String name, int my_Money)
	{
	
		this.object = ob;
		this.name = name;
		this.rs = my_Money;
	}

	
	public void run() { 
		object.withdrawn(name, rs); 
	}
}

class Thread_Deposit extends Thread {

	Atm object;
	String name;
	int rs;

	Thread_Deposit(Atm ob, String name, int money)
	{
		this.object = ob;
		this.name = name;
		this.rs = money;
	}

	public void run() {
		object.deposit(name, rs);
		}
}

class ATMProblem {

	// Main driver method
	public static void main(String[] args)
	{
	
		Atm obj = new Atm();

		// Creating threads
		Thread_Withdrawal t1
			= new Thread_Withdrawal(obj, "prakriiti", 20);
		Thread_Withdrawal t2
			= new Thread_Withdrawal(obj, "rashi", 40);
		Thread_Deposit t3
			= new Thread_Deposit(obj, "aditi", 35);
		Thread_Withdrawal t4
			= new Thread_Withdrawal(obj, "shreya", 80);
		Thread_Withdrawal t5
			= new Thread_Withdrawal(obj, "sejal", 40);
		Thread_Withdrawal t6
		= new Thread_Withdrawal(obj, "parth", 50);


		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}