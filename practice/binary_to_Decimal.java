import java.util.Scanner;
public class binary_to_Decimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int binary_num=sc.nextInt();
        sc.close();
        int ans=0;
        int power=1; // 2^0=1 power of 2
        while(binary_num>0){
            int unit_dig=binary_num%10;
            ans = ans+(unit_dig*power);
            binary_num/=10;
            power*=2;
        }
        System.out.println(ans);
    }
}
