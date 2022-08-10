
public class SuppressWarningAnnotation {

	@SuppressWarnings({"unchecked", "deprecation"})
	public static void display() {
		System.out.println("Supress Warning...");
	}
	
	public static void main(String[] args) {
		display();
	}

}
