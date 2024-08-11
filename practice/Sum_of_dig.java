import java.util.Scanner;

public class Sum_of_dig {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            int last_dig=n%10;
            sum = sum+last_dig;
            n=n/10;


        }
        System.out.println("The sum of the digits of the numbers is :"+ sum);

}
}
