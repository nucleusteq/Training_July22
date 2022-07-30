package Introduction.Arrays;
import java.util.*;

public class AddTwoMatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p, q, m, n;  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows u want in the first matrix :- ");
        p = sc.nextInt();    
        System.out.print("Enter how many columns u want in the first matrix :- ");
        q = sc.nextInt();   
        System.out.print("Enter how many rows u want in the second matrix :- ");
        m = sc.nextInt(); 
        System.out.print("Enter how many columns u want in the second matrix :- ");
        n = sc.nextInt();   
        if (p == m && q == n) 
        {
            int a[][] = new int[p][q];   
            int b[][] = new int[m][n];   
            int c[][] = new int[m][n];    
            // first matrix
            System.out.println("Enter all the elements of first matrix :- ");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            //second matrix
            System.out.println("Enter all the elements of second matrix :- ");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            //Printed first matrix is here
            System.out.println("First Matrix :- ");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            //Printed second matrix is here
            System.out.println("Second Matrix :- ");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            //adding all in here
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            //Print resukt is here
            System.out.println("Matrix after addition :- ");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Addition not possible");
            System.out.println("Try Again");
        }

	}

}
