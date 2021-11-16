package easyCollection.array;

import java.util.*;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        long sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum * 10;
            sum = sum + digits[i];
        }
        String temp = Long.toString(++sum);
        int[] rs = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            //ascii
            rs[i] = temp.charAt(i) - '0';
        }
        return rs;
    }

    public static int[] plusOne2(int[] digits) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean check = true;
        int temp = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (check == true) {
                temp = digits[i] + 1;
                if (temp == 10) {
                    stack.push(0);
                    check = true;
                    if (i == 0) {
                        stack.push(1);
                    }
                } else {
                    stack.push(temp);
                    check = false;
                }
            } else {
                stack.push(digits[i]);
            }
        }
        int[] rs = new int[stack.size()];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = stack.pop();
        }
        return rs;
    }

    public static int[] plusOne3(int[] digits) {
        if(digits[digits.length - 1] < 9)
            digits[digits.length - 1]++;
        else if (digits.length == 1)
            return new int[]{1,0};
        else{
            int[] newdigits = plusOne3(Arrays.copyOf(digits, digits.length - 1));
            return Arrays.copyOf(newdigits, newdigits.length+1);
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] test3 = {9};
        int[] test4 = { 9, 9};
        int[] test5 = {9,8,9};
        int[] rs = plusOne2(test5);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }
    }
}
