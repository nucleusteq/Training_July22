public class AddingMatrices{
    public static void main(String[] args) {
        
        int a[][]={{9,10,12},{28,48,63},{37,45,51}};    
        int b[][]={{11,35,44},{25,4,63},{12,32,54}};    
    
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