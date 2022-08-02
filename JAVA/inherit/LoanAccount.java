package inherit;


public class LoanAccount extends Account{
	public LoanAccount(int accountNo, int phoneNo, int dob, int balance, String address, String name) {
		super(accountNo, phoneNo, dob, balance, address, name);
		// TODO Auto-generated constructor stub
	}
	public void payEMI() {} 
	public void topUpLoan() {}
	public void repayment() {}
}


