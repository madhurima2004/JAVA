import java.util.Scanner; 

public class String_Case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.next();
        for(int i=0;i< s.length();i++){
            char c= s.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.println(c);
            }
        }

    }
}
