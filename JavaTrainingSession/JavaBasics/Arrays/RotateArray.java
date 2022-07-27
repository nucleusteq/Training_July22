package JavaTrainingSession.JavaBasics.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int temp=0;
        int[] arr={1,2,3,4,5};
        int n=2;//number of roatation
        do{
        temp=arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0] = temp;
       
        n--;
    }while(n!=0);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+",");
     }
    }
}
