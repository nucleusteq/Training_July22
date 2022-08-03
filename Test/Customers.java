package Collection;

public class Customers {
	
	public static void main(String[] args) {
		
		
	}
}



	class Discount extends Customers{
		int amount;
		public void premium_Membership()
		{
			double discount=(amount*25)/100;
			System.out.println("Premium Membership will provide  25% discount"+discount);
		}
		public void silver_Membership()
		{
			double discount=(amount*25)/100;
			System.out.println("Silver Membership will provide  15% discount"+discount);
		}
		public void gold_Membership()
		{
			double discount=(amount*25)/100;
			System.out.println("Gold_Membership Membership will provide  8% discount"+discount);
		}
		public void no_Membership()
		{
			System.out.println("No discount provide ");
		}
		
	}
	
	
	

	class Visits extends Customers{
		
		
		
	}



	