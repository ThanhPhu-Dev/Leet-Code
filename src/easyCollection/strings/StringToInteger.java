package easyCollection.strings;

import java.util.Calendar;

public class StringToInteger {
    public static int myAtoi(String s) {
        int rs = 0;
        char c;
        int operator = 1;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if ( check == false && (c == ' ' || ((c == '-' || c == '+' ) && (i+1) < s.length() && Character.isDigit(s.charAt(i+1))))){
                if(c == '-' ) operator = -1;
                continue;
            }
            else if (Character.isDigit(c)) {
                try {
                    check = true;
                    rs = Math.multiplyExact(rs, 10);
                    rs = Math.addExact(rs, Character.getNumericValue(c));
                } catch (ArithmeticException e) {
                    if(operator == 1) return Integer.MAX_VALUE;
                    else return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return rs * operator;
    }

    public static void main(String[] args) {
        String s = "42";
        String s2 = "   -42";
        String s3 = "4193 with words";
        String s4 = "words and 987";
        String s5 = "-91283472332";
        String s6 = "+1";
        String s7 = "+-12";
        String s8 = "00000-42a1234";
        String s9 = "   +0 123";
        System.out.println(myAtoi(s9));

    }
}
