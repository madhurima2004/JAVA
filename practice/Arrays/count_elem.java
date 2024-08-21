// package Arrays;

import java.util.Scanner;

public class count_elem {

static int count_occurances(int[] arr,int x){

    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
        count++;
        }
    }
    return count;
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

        System.out.println("Count of x is :"+ count_occurances(arr, x));
    }
}
