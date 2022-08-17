package LambdaFunctions;
import java.util.Scanner;
public class CalculateAreaLambdaFunctions2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LambdaClass lambda=new LambdaClass();
		String shape=sc.next().toLowerCase();
		if(lambda.map.containsKey(shape)) {
			System.out.println(lambda.map.get(shape).area());
		}
		else {
			System.out.println("No area to be returned for the given Shape");
		}
		sc.close();
	}

}
