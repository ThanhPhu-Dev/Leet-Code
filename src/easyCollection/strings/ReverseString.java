package easyCollection.strings;

public class ReverseString {
    public static void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++){
            if(s[i] != s[s.length - 1 - i]){
                temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        char[] s2 = {'h','e','l','l','o'};

        reverseString(s2);
        for (char c : s2) System.out.print(c + " ");
    }
}
