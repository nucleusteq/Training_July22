package Array;

import java.util.*;

public class Array_add_matrics {
    public static void main(String args[]){
        //here it is adding all the matrics in it and showing out put
        int a[][]={{1,2,1},{2,2,2},{3,8,1}};    
        int b[][]={{1,4,1},{4,1,4},{1,2,3}};    
    
        int c[][]=new int[3][3];   
        
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
            c[i][j]=a[i][j]+b[i][j];     
            System.out.print(c[i][j]+" ");    
        }       
        System.out.println(); 
        }
    }
}
