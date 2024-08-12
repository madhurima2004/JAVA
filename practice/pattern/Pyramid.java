import java.util.Scanner;

public class Pyramid {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r= sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=r;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        for(int l=2;l<=i;l++){
            System.out.print("*");
        }
        System.out.println();
    }
   } 
}
