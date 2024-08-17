import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {   
     Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.next();
        // System.out.println(s);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        // if(rev==s){
        //     System.out.println("PALINDROM");
        // }
        // else{
        //     System.out.println("NOT PALINDROM");
        // }
        System.out.println("Reverse string is:"+ rev);
}
}
