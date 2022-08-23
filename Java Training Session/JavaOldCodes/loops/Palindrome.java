package loops;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        char a[n];
        int lenght = 0,i, flag=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any string");
        a[n]= sc.next().charAt(0);
        while(a[lenght]!=0)
        {
            lenght ++;
        }
        if (a[i]==a[lenght])
        {
            i++;
            lenght--;

        }
        else 
        {
            flag=1;
            break;

        }
        if(flag==0)
        System.out.println("palindrome");
        else
        System.out.println("not a palindrome");
        }

        
    }
    

