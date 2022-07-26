import java.util.Scanner;
class Pattern2{
	public static void main(String[] args){
		int valueOfA=51;
		for(int i=1;i<=5;i++){
			valueOfA=51;
			for(int j=1;j<=i;j++){
				System.out.print((char)valueOfA+" ");
				valueOfA++;
			}
			System.out.println();
		}
	}
}