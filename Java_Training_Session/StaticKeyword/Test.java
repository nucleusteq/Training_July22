class Product{

	static double price=499;
	static void findGSTByCity(String city){
		switch(city){
			case "Indore":System.out.println("GST in Indore is: "+((price*20)/100));
					  break;
			case "Pune":System.out.println("GST in Pune is: "+((price*25)/100));
					  break; 
			case "Gwalior":System.out.println("GST in Gwalior is: "+((price*18)/100));
					  break;
			case "Ranchi":System.out.println("GST in Ranchi is: "+((price*28)/100));
					  break;
			case "Srinagar":System.out.println("GST in Srinagar is: "+((price*12)/100));
					  break;
			default:
				  System.out.println(price*((price*24)/100));
					  break;
		}	
	}
}

public class Test{
	public static void main(String[] args){
		Product.findGSTByCity("Ranchi");
		Product.findGSTByCity("Pune");
		Product.findGSTByCity("Indore");
		Product.findGSTByCity("Gwalior");
		Product.findGSTByCity("Srinagar");
	}
}