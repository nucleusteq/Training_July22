class Bike{
	private String wheelType="alloy";
	private String speedometer="analogue";
	class Hero{
		String brandName="Hero";
		int maxPower=800;
		public void display(){
			System.out.println("Display Method of Inner Hero Class Called");
			System.out.println("Brand Name: "+brandName+" WheelType: "+wheelType+" SpeedoMeter: "+speedometer+" MaxPower: "+maxPower);
		}
	}
	class Honda{
		int maxPower=750;
		String brandName="Honda";
		public void show(){
			System.out.println("Show Method of Inner Honda Class Called");
			System.out.println("Brand Name: "+brandName+" Wheel Type: "+wheelType+" SpeedoMeter: "+speedometer+" MaxPower: "+maxPower);
		}
	}

	public static void main(String[] args){
		Bike.Hero heroBike=new Bike().new Hero();
		heroBike.display();
		System.out.println("Variable of inner hero class from main method: "+heroBike.brandName);
		System.out.println();
		Bike.Honda hondaBike=new Bike().new Honda();
		hondaBike.show();
		System.out.println("Variable of inner honda class from main method: "+hondaBike.brandName +" "+hondaBike.maxPower);
	}
}