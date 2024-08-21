// package Arrays;
//count the number of elements strictly greater than x

import java.util.Scanner;

public class Count_greater_element {
    
static int countGreaterElement(int[] arr, int x){
    int count=0;
    for(int i=0;i<=arr.length-1;i++){
        if(arr[i]>x){
            count++;
        }
    }
    return count;
    // return -1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + "elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x:");
        int x=sc.nextInt();

        System.out.println("the count of  strictly greater value of x is :"+ countGreaterElement(arr, x));
}
}
