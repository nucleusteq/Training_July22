package ATMProblem;
import java.util.*;
class Program extends Thread{
	synchronized public void run() {
		Scanner scan = new Scanner(System.in);
		int balance = 1000, num, wdmoney, dmoney;
		boolean choice = true;
		while(choice==true) {
		System.out.println("Welcome to HDFC ATM."+Thread.currentThread().getName()+" Please select your option: \n1) Check account balance\n2) Deposit money\n3) Withdraw money");
		num = scan.nextInt();
		switch(num) {
		case 1:  System.out.println("Your current balance is "+balance);
				 break;
		case 2:  System.out.println("Enter amount to deposit: ");
		         dmoney = scan.nextInt();
		         balance = balance + dmoney;
		         System.out.println("Deposit successful");
		         break;
		case 3:  System.out.println("Enter amount to withdraw: ");
				 wdmoney = scan.nextInt();
				 while(balance>wdmoney) {
					 balance = balance - wdmoney;
				 } 
				 System.out.println("Withdraw successful");
				 break;
		default: System.out.println("Invalid option");
		}
		System.out.println("Do you want to continue? Press 1 for yes or 2 for no");
		int i = scan.nextInt();
		if (i==1) {
			System.out.println("Returning...");
		}
		else {
			System.out.println("You're exiting the ATM");
			choice = false;
		}
		}
	}
}
public class ATM {
	public static void main(String[] args) {
		Program p1 = new Program();
		Program p2 = new Program();
		Program p3 = new Program();
		Program p4 = new Program();
		
		p1.setName("Shantanu");
		p2.setName("Shreya");
		p3.setName("Samarth");
		p4.setName("Saiyam");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		}
}