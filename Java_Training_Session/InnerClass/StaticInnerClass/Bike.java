public class Bike{
	static String brandName="Hero";
	static String wheelType="Alloy";
	static class Hero{
		void show(){
			System.out.println(brandName+" "+wheelType);
		}
	}

	public static void main(String[] args){
		Bike.Hero heroBike=new Bike.Hero();
		heroBike.show();
	}
}