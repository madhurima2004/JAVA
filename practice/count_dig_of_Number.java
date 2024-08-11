import java.util.Scanner;

public class count_dig_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int count_of_dig=0;
        while(n>0){
            n=n/10;
            count_of_dig++;
        }
        System.out.println("Number of Digits :" + count_of_dig);
    }
}
