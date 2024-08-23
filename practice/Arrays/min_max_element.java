// package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class min_max_element {
    
static int[] newArray(int[] arr){
        Arrays.sort(arr);
        int[] ans ={arr[0],arr[arr.length-1]};
        return ans;

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
        int[] ans = newArray(arr);
        // System.out.println(newArray(arr));
        System.out.println("Smallest Element :" + ans[0]);
        System.out.println("Largest Element :" + ans[1]);
}
}
