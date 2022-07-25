public class Rotatingarray {
    public static void main(String[] args) {
        int temp=0;
        int[] arr={78,67,34,90,11};
        int n=2;//number of rotation
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