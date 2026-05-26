import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] charsFreq = new int [26];
        for (int i = 0; i < s.length(); i ++) {
            int index = s.charAt(i) - 'a';
            charsFreq[index] ++;
        }
        for (int i = 0; i < t.length(); i ++) {
            int index = t.charAt(i) - 'a';
            if (charsFreq[index ] == 0) {
                return false;
            }
            charsFreq[index] --;
        }
        return true;
    }
}
