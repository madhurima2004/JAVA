import java.util.Scanner;

public class Right_align_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=row-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
