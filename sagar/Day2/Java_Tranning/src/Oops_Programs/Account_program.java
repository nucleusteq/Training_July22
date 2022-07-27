package Oops_Programs;

class Account{
	private int ac_no;
	private String name;
	private String address;
	private String Dob;
	private double balance;

	Account(){

	}

	Account(int ac_no,String name,String address,String Dob,double balance){
		this.ac_no=ac_no;
		this.name=name;
		this.address=address;
		this.Dob=Dob;
		this.balance=balance;
	}

	public void closeAccount(){
		System.out.println("Account Closed");
	}
	public void setAc_No(int ac_no){
		this.ac_no=ac_no;
	}
	public int getAc_No(){
		return ac_no;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setAddress(String address){
		this.address=address;	
	}
	public String getAddress(){
		return address;
	}

	public void setDateOfBirth(String Dob){
		this.Dob=Dob;
	}
	public String getDateOfBirth(){
		return Dob;
	}

	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	
}

class SavingsAccount extends Account{
	public void withdrawMoney(){
		System.out.println("Money Withdraw successfully");
		
	}

	public void depositMoney(){
		System.out.println("Money deposit successfully  ");
	}
	
	public void fixedDeposit(){
		System.out.println("Money added");
	}
}

class Loan_Account extends Account{
	public void payEMI(){
		System.out.println("EMI deposited");
	}
	public void toUpLoan(){
		System.out.println("send to increase loan ");
	}
	public void repayment(){
		System.out.println("Repayment started");
	}
}

public class Account_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(123456789,"Sagar Kalthiya","Demo Add is here ","00/00/0000",10000);
		// Saving method called
		SavingsAccount saving=new SavingsAccount();
		saving.depositMoney();
		saving.withdrawMoney();
		saving.fixedDeposit();
		System.out.println(account.getBalance());

        /// Loan method is called 
		Loan_Account loanAccount=new Loan_Account();
		loanAccount.payEMI();
		loanAccount.toUpLoan();
		loanAccount.repayment();
		

	}

}
