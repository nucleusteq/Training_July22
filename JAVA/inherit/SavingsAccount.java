package inherit;

public class SavingsAccount extends Account {
	public SavingsAccount(int accountNo, int phoneNo, int dob, int balance, String address, String name) {
		super(accountNo, phoneNo, dob, balance, address, name);
		
	}
	public void withdraw(String name,int withdrwal) {
		
	        if (balance >= withdrawal) {
	            System.out.println(name + " withdrawn "
	                               + withdrawal);
	 
	            balance = balance - withdrawal;
	            System.out.println("Balance after withdrawal: "
	                               + balance);
	} 
	public void deposit(String name, int deposit) {
		
		
	        System.out.println(name + " deposited " + deposit);
	        balance = balance + deposit;
	        System.out.println("Balance after deposit: "
	                           + balance);
	        }
	}
	
	public void fixedDeposit() {}

}
