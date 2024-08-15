//create a new string with digits first and then characters

import java.util.Scanner;

public class new_str_with_digit {
     public static void main(String[] args) {
        String d = "",r="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.next();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(c)){
                d=d+c;  
            }
            else{
                r=r+c;
            }
        }
     String com= d+r;
     System.out.println(com);   
}
}
