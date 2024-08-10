import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        
      
        Solution obj = new Solution();
        
       
        boolean result = obj.isPowerOfTwo(n);
        
       
        if (result) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is not a power of two.");
        }
        
        
        sc.close();
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
         if (n == 0) return false;
        
        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) break;
            n /= 2;
        }
        return false;
    }
    }
