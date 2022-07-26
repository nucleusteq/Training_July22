package introduction;

public class AllPatterns {

	public static void main(String[] args) {
    System.out.println("***********************\nPattern 1 :");
		for(int i = 1; i<=3; i++)
    {
            System.out.println(i); 
         for(int j=1; j<=4 ; j++){
           System.out.print(j);
         }   System.out.println("");   
    }

    
    System.out.println("***********************\nPattern 2 :");

    for(int i = 1; i<=5; i++){
      for(int j=1; j<=i ; j++){
          System.out.print(i);
      }
      System.out.println();
  }

  System.out.println("***********************\nPattern 3 :");


  for(char i = 65 ; i<70; i++){
    for(char j=65; j<=i ; j++){
        System.out.print(j);
    }
    System.out.println();
}
        
    }
}
