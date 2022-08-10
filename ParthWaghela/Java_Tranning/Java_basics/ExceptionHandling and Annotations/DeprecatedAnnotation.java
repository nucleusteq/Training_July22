
public class DeprecatedAnnotation {

	@Deprecated
	public static void displayOld() {
		System.out.println("Old");
	}
	
	public static void displayNew() {
		System.out.println("New");
	}
	
	public static void main(String[] args) {
		
		displayOld();
		displayNew();
		
	}
	
}
