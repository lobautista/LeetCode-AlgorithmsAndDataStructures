import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        Map<Character, Integer> visitedChar = new HashMap<>();
        int max = 0;
        for (int right = 0; right < s.length(); right ++) {
            char currentChar = s.charAt(right);
            if (visitedChar.containsKey(currentChar) && visitedChar.get(currentChar) >= left) {
                left = visitedChar.get(currentChar) + 1;
            }
            visitedChar.put(currentChar, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
