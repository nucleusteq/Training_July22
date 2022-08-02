package Java_Lambda;
@FunctionalInterface
interface hello{
	public void display();
}
public class test {
	public static void main(String[] args) {
		hello h = ()-> System.out.println("Hello world!");
		h.display();
	}
}
