package ShapeLambda;
import java.util.Scanner;
interface FuncInterface{
	void rect(int x,int y);
//	void circle(int r);
//	void cube(int a);
//	void sphere(int r);
//	void prism(int b,int p,int h);
//	void pentagon(int l );
}

public class ShapeLambda {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String shape = sc.nextLine();
		switch(shape) {
		case "rect" :
		{
			FuncInterface fobj = (int x,int y)-> { System.out.println("Area of rect is" +x*y );};
			fobj.rect(4, 5);
		}
		}
			
		
		
	}

}
