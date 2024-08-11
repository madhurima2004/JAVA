//s=1-2+3-4....n

import java.util.Scanner;

public class Sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
            sum=sum-i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.println("The sum of the series is :"+ sum);
    }
}
