package easyCollection.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        //tương đương 26 chữ cái viết thường
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)- 'a';
            count[index]++;
        }
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)- 'a';
            if(count[index] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
