import java.util.Scanner; 

public class count_case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.next();
        int count_upper=0;
        int count_Lower=0;
        for(int i=0;i< s.length();i++){
            char c= s.charAt(i);
            if(Character.isUpperCase(c)){
                count_upper++;
                
            }
            if(Character.isLowerCase(c)){
                count_Lower++;
               
            }
        }
        System.out.println("count of uppercase:"+ count_upper);
         System.out.println("count of lowercase:"+ count_Lower);

    }
}
