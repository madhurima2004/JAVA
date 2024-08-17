import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        String sn = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str= sc.next();
        if (isPalindrome(str))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
}
}
static boolean isPalindrome(String str)
{

    int i = 0, j = str.length() - 1;
    while (i < j) {
        if (str.charAt(i) != str.charAt(j))
            return false;
        i++;
        j--;
    }
    return true;
}
