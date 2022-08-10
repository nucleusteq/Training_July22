
public class LocalInner {
	void display() {
		class Hero{
			void show() {
				System.out.println("method show");
			}
		}
		Hero h=new Hero();
		h.show();
	}
	public static void main(String[] args) {
		LocalInner LI= new LocalInner();
	    LI.display();
	}
}
