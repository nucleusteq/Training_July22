package student;

public class InnerBike {
void display() {
	class InnerHero{
		
		void show() {
			System.out.println("inside show");
		}
		
	} 
	InnerHero h = new InnerHero();
	h.show();
}
public static void main(String args[]){ 
	InnerBike i = new InnerBike();
	i.display();
}
}
