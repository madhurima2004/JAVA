import java.util.Scanner;

public class diagonal_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number :");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i>=2 && j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
