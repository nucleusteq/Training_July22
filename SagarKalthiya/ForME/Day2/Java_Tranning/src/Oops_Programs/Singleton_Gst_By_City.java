package Oops_Programs;
import java.util.*;

class Product{
	static void Calcu_GST(int price, String city) {
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
			  System.out.println("Default Value :- "+price*((price*24)/100));
				  break;
	}	
	}
}

public class Singleton_Gst_By_City {
	static int price;
	 static{
		price = 599;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city name");
		String city =  sc.nextLine();
		Product.Calcu_GST(price,city);
		
		
	}

}
