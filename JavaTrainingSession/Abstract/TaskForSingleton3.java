package JavaTrainingSession.Abstract;
class Product{  
	static float price=5;
	static{
		System.out.println("Current Price : "+ price);
		price = 10;
		System.out.println("Static Block -- Changed Price : "+ price);
	}
	static double findTheGSTByCity(float city){
		return price*city ;
	}
  }  

class TaskForSingleton3{  
	public static void main(String args[])
	{  
	Product obj = new Product();
	int city_gst_val = 4;
	System.out.println("Total price is : "+ obj.findTheGSTByCity(city_gst_val));
	
	
	}  
  } 