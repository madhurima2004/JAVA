import java.util.Scanner; 

public class count_case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.next();
        int count_u=0;
        int count_L=0;
        for(int i=0;i< s.length();i++){
            char c= s.charAt(i);
            if(Character.isUpperCase(c)){
                count_u++;
                
            }
            if(Character.isLowerCase(c)){
                count_L++;
               
            }
        }
        System.out.println("count of uppercase:"+ count_u);
         System.out.println("count of lowercase:"+ count_L);

    }
}
