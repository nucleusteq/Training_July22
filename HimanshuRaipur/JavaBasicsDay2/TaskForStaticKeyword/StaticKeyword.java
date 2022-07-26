class Product{

	static double price=499;
	static void findGSTByCity(String city){
		switch(city){
			case "Raipur":System.out.println("GST in Raipur is: "+((price*20)/100));
					  break;
			case "Punjab":System.out.println("GST in Punjab is: "+((price*25)/100));
					  break; 
			case "Mumbai":System.out.println("GST in Mumbai is: "+((price*18)/100));
					  break;
			case "Agra":System.out.println("GST in Agra is: "+((price*28)/100));
					  break;
			case "Kashmir":System.out.println("GST in Kashmir is: "+((price*12)/100));
					  break;
			default:
				  System.out.println(price*((price*24)/100));
					  break;
		}	
	}
}

public class Test{
	public static void main(String[] args){
		Product.findGSTByCity("Kashmir");
		Product.findGSTByCity("Punjab");
		Product.findGSTByCity("Raipur");
		Product.findGSTByCity("Agra");
		Product.findGSTByCity("Mumbai");
	}
}