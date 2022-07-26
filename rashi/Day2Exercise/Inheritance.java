package account;

class SavingsAccount extends Account{
			        SavingsAccount(int x) {
		            super(x);
		            System.out.println("Savings Account open : ");
		        }
		        void WithDraw() { System.out.println("Withdraw money will display here");}
		        void FixedDeposit() {System.out.println("No Fixed deposit ");}
		        void Deposit() {System.out.println("Deposit 2500rs");}
				    }
			
		class LoanAccount extends Account{
			    LoanAccount(int x) {
		        super(x);
		        System.out.println("Loan Account open : ");
		    }
		    void PayEMI() { System.out.println("There no EMI to pay");}
		    void TopUpLoan() {System.out.println("TopUpLoan is available for 1250rs ");}
		    void Repay() {System.out.println("Replay done - 250rs");}
		}
class Account {
		    int AccountNo;
			int Balance;
			int DOB;
			int PhoneNo;
			char name;
			char Address;
			
			
			Account(int x){
				 System.out.println("account open : "+x);
			 }
			 void CloseAccount() {
		        System.out.println("Your Account is closed");
			 }
			 
			 
			public int getAccountNo() {
				return AccountNo;
			}
			public void setAccountNo(int accountNo) {
				AccountNo = accountNo;
			}
			public int getBalance() {
				return Balance;
			}
			public void setBalance(int balance) {
				Balance = balance;
			}
			public int getDOB() {
				return DOB;
			}
			public void setDOB(int dOB) {
				DOB = dOB;
			}
			public int getPhoneNo() {
				return PhoneNo;
			}
			public void setPhoneNo(int phoneNo) {
				PhoneNo = phoneNo;
			}
			public char getName() {
				return name;
			}
			public void setName(char name) {
				this.name = name;
			}
			public char getAddress() {
				return Address;
			}
			public void setAddress(char address) {
				Address = address;
			}
	    
		public static void main(String[] args) {
		   
		   SavingsAccount Sc=new SavingsAccount(12345);
		   Sc.Deposit();
		   Sc.FixedDeposit();
		   Sc.WithDraw();
		   Sc.CloseAccount();
		    
		   LoanAccount La=new LoanAccount(12345);
		   La.TopUpLoan();
		   La.Repay();
		   La.PayEMI();
		   Sc.CloseAccount();
		}
		}

