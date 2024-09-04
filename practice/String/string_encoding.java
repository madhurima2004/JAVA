//1.  replace vowel to % in 1st word
//2.  replace consonent to # in 2nd word
//3. upercase in 3rd 
public class string_encoding {
public static void main(String[] args) {
    String str = "How are You?";
    String words[] = str.split(" ");

    String firstWord = words[0].replaceAll("[AEIOUaeiou]", "%");
    String secondWord = words[1].replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "#");
    String thirdWord = words[2].toUpperCase();
    String result = firstWord + secondWord + thirdWord;
    System.out.println(result);
}
}
