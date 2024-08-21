// package Arrays;
//find last occurrence of ana element x in array
import java.util.Scanner;

public class last_occurrence {
    static int lastOccurrence(int[] arr, int x){
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]==x){
                return i;
            }
           

        }
        return -1;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+"elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x:");
        int x=sc.nextInt();

        System.out.println("Index of last occurrence of x is :"+ lastOccurrence(arr, x));
}
}
