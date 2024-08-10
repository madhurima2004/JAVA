import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
        int decimal_no=sc.nextInt();
        // sc.close();
        int ans=0;
        int power=1;
        while(decimal_no>0){
            int parity = decimal_no%2;
            ans=ans+(parity*power);
            power*=10;
            decimal_no/=2;
        }
        System.out.println(ans);

}
}
