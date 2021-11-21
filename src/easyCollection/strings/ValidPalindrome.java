package easyCollection.strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "");
        s = s.replaceAll("[^a-z0-9]", "");
        if (s.isEmpty())
            return true;
        for (int i = (s.length() -1) / 2; i >= 0; i--) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        int start = 0; /* pointer from start of a string */
        int end = s.length() - 1; /* pointer from end of string */
        while(start < end) {
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++; /* increment start before we find a letter or digit */
            }
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--; /* decrement end before we find a letter or digit */
            }
            if (Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                start++; end--; /* increment and decrement both if symbols at position are equal */
            } else {
                return false; /* otherwise false */
            }
        }
        return true; /* true if we reach end of a function */
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a_canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        String s4 = "0P";
        String s5 = ",";
        System.out.println(isPalindrome(s4));
    }
}
