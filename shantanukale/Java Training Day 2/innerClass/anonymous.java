package innerClass;
abstract class Bike2{
	abstract void display();
}
public class anonymous {
	public class Hero{
		public static void main(String[] args){
			Bike2 bike=new Bike2(){
				void display(){
					System.out.println("Anonymous inner class executed");
				}
			};
			bike.display();	
		}
	}
}
