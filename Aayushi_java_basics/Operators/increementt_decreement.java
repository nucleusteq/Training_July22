 import java.util.*; 
 class IncrementDecrementUsingScanner  
 { 
                     public static void main(String args[]) 
            { 
                       int a; 
                       Scanner scan =new Scanner(System.in); 
                       System.out.print("Enter the Value of a : "); 
                       a=scan.nextInt(); 
                       System.out.println("Before Increment A : "+a); 
                      
                       System.out.println("After Two Time Increment A : " +a); 
                       System.out.println("Before Decrement A : "+a); 
                       --a; 
                       a--; 
                       System.out.println("After Decrement Two Time A : "+a); 
            } }