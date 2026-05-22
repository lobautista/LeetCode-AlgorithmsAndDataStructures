import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct2(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i ++) {
            char currentChar = magazine.charAt(i);
            magazineMap.put(currentChar, magazineMap.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i ++) {
            char currentChar = ransomNote.charAt(i);
            Integer freqChar = magazineMap.get(currentChar);
            if (null != freqChar && freqChar > 0) {
                magazineMap.put(currentChar, freqChar - 1);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        int [] freqChars = new int [26];
        for (int i = 0; i < magazine.length(); i ++) {
            int current = magazine.charAt(i) - 'a';
            freqChars[current]++;
        }
        for (int i = 0; i < ransomNote.length(); i ++) {
            int freq = ransomNote.charAt(i) - 'a';
            if (freqChars[freq] == 0) {
                return false;
            }
            freqChars[freq] --;
        }
        return true;
    }
}
