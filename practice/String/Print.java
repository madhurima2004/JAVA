import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.next();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            System.out.println(c+" "+ (int)c);
            if(Character.isUpperCase(c)){
                System.out.println(c);
            }
        }

    }
}
