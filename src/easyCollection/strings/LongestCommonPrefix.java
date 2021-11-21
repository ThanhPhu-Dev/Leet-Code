package easyCollection.strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if(strs.length ==  1)
            return strs[0];
        for (int j = 0; j < strs[0].length(); j++) {

            while (i < strs.length - 1) {
                if (j >= strs[i + 1].length() || strs[i].charAt(j) != strs[i + 1].charAt(j))
                    return sb.toString();
                i++;
            }
            i=0;
            sb.append(strs[0].charAt(j));
        }
        return sb.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        String firstStr = strs[0];
        char[] first = firstStr.toCharArray();
        int pos = first.length - 1;
        if (pos < 0) return "";
        for (int i = 1; i < strs.length; i++) {
            String next = strs[i];
            int length = next.length();
            if (length <= pos) pos = length - 1;
            for (int j = 0; j <= pos; j++) {
                if (first[j] != next.charAt(j)) {
                    pos = j - 1;
                    break;
                }
            }
            if (pos < 0) return "";
        }
        return firstStr.substring(0, pos + 1);
    }

    public static void main(String[] args) {
        String[]  strs = {"flower","flow","flight"};
        String[]  strs2 = {"dog","racecar","car"};
        String[]  strs3 = {"a"};
        String[]  strs4 = {"ab", "a"};
        String[]  strs5 = {"reflower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
