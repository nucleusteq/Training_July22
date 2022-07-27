class Account{
	private int accountNumber;
	private String name;
	private String address;
	private String dateOfBirth;
	private double balance;
	Account(){
	}
	Account(int accountNumber,String name,String address,String dateOfBirth,double balance){
		this.accountNumber=accountNumber;
		this.name=name;
		this.address=address;
		this.dateOfBirth=dateOfBirth;
		this.balance=balance;
	}
	public void closeAccount(){
		System.out.println("Account Closed");
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
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
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth=dateOfBirth;
	}
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	
}
class SavingsAccount extends Account{
	public void withdrawMoney(double withdrawAmount, Account account){
		double balance=account.getBalance();
		System.out.println(balance);
		if(balance-withdrawAmount >0){
			balance=balance-withdrawAmount;
			account.setBalance(balance);
			System.out.println("Money Withdrawn and the remaining balance is: ");
		}
		else{
			System.out.println("Insufficient Amount");
		}
		
	}
	public void depositMoney(int amount,Account account){
		double balance=account.getBalance();
		account.setBalance(balance+amount);
		System.out.println("Money deposited  ");
	}
	
	public void fixedDeposit(){
		System.out.println("Money added in fixed deposit");
	}
}
class LoanAccount extends Account{
	public void payEMI(){
		System.out.println("EMI deposited ");
	}
	public void toUpLoan(){
		System.out.println("Request to increase loan amount send");
	}
	public void repayment(){
		System.out.println("Repayment method called");
	}
}
public class Inheritance{
	public static void main(String[] args){
		Account account=new Account(789654325,"Aayushi Gopawar","smriti nagar","28/01/2000",70000);
		SavingsAccount savingsAccount=new SavingsAccount();
		System.out.println(account.getBalance());
		savingsAccount.withdrawMoney(2000,account);
		System.out.println(account.getBalance());
		System.out.println("Balance Before : "+account.getBalance());
		savingsAccount.depositMoney(3000,account);
		System.out.println("Balance After: "+account.getBalance());
		savingsAccount.fixedDeposit();
		LoanAccount loanAccount=new LoanAccount();
		loanAccount.payEMI();
		loanAccount.toUpLoan();
		loanAccount.repayment();
		
	}
}