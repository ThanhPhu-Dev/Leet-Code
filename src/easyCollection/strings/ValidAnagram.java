package easyCollection.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            int count[]=new int[26];
            for(int i=0;i<s.length();i++)
                count[s.charAt(i)-97]++;
            int count2[]=new int[26];
            for(int i=0;i<t.length();i++)
                count2[t.charAt(i)-97]++;
            return Arrays.equals(count,count2);
        }
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String s2 = "rat", t2 = "car";
        String s3 = "ac", t3 = "bb";
        System.out.println(isAnagram(s,t));
    }
}
