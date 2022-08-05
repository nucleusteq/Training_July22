package trainingday2;

import java.util.*;
class Product{
	static double price=1000.0;
	static double total;
			
	static void findTheGSTByCity(String s) {
		switch(s) {
		case "delhi":
			total = price+(price*0.08);
			System.out.println("Price after applying gst in "+s+" is: "+total);
			break;
			
		case "indore":
			total = price+(price*0.12);
			System.out.println("Price after applying gst in "+s+" is: "+total);
			break;
		case "mumbai":
			total = price+(price*0.04);
			System.out.println("Price after applying gst in "+s+" is: "+total);
			break;
		case "guwahati":
			total = price+(price*0.11);
			System.out.println("Price after applying gst in "+s+" is: "+total);
			break;
		case "bhopal":
			total = price+(price*0.18);
			System.out.println("Price after applying gst in "+s+" is: "+total);
			break;
		default:
			System.out.println("Invalid city");
			 }
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter city(smallcase): ");
		String city = scan.next();
		Product p = new Product();
		p.findTheGSTByCity(city);
	}
}