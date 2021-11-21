package easyCollection.strings;

public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {
        int indexOf = -1;
        int i = 0;
        if(haystack.length() < needle.length()) return -1;
        if(needle.isEmpty()) return 0;
        if(needle.length() == haystack.length()){
            if(needle.equals(haystack)) return 0;
            else return -1;
        }
        while (i < haystack.length() - (needle.length() - 1)) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int a = i + needle.length() -1;
                if (a >= haystack.length()) return -1;
                indexOf = i;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(j + i) != needle.charAt(j)) {
                        indexOf = -1;
                    }
                }
                if(indexOf != -1 ) return indexOf;
            }
            i++;
        }
        return indexOf;
    }

    public static int strStr2(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if ((haystack.substring(i, i + needle.length())).equals(needle)) {
                return i;
            };
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        String haystack1 = "aaaaa", needle1 = "bba";
        String haystack2 = "", needle2 = "";
        String haystack3 = "", needle3 = "a";
        String haystack4 = "a", needle4 = "";
        String haystack5 = "mississippi", needle5 = "issip";
        String haystack6 = "a", needle6 = "a";
        System.out.println(strStr2(haystack6, needle6));
    }
}
