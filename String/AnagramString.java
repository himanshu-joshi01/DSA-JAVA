import java.util.*;

public class AnagramString {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silenT";
   

        if (str1.length() == str2.length()) {
            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();

            char charStr1[] = str1.toCharArray();
            char charStr2[] = str2.toCharArray();

            Arrays.sort(charStr1);
            Arrays.sort(charStr2);

            if (Arrays.equals(charStr1, charStr2)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }

        } else {
            System.out.println("Strings are not of same length thats why not Anagram");
        }

    }
}
