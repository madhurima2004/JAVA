import java.util.Scanner;

public class diagonal2_pattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number :");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=r;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=1;k++){
                if(i>=2 && k>1){
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
