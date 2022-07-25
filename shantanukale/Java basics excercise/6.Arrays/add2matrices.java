public class add2matrices{
    public static void main(String[] args) {
        
        int x[][]={{7,5,2},{7,2,0},{0,8,8}};    
        int y[][]={{9,3,2},{6,4,4},{4,8,7}};    
    
        int z[][]=new int[3][3];   
        
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
            z[i][j]=x[i][j]+y[i][j];     
            System.out.print(z[i][j]+" ");    
        }       
        System.out.println(); 
        }
    }
}