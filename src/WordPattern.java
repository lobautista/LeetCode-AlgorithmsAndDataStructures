import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Set<String> visitedWords = new HashSet<>();
        Map<Character, String> charsMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i ++) {
            char currentChar = pattern.charAt(i);
            if (charsMap.containsKey(currentChar)) {
                if (!charsMap.get(currentChar).equals(words[i])) {
                    return false;
                }
            } else {
                if (visitedWords.contains(words[i])) {
                    return false;
                }
            }
            charsMap.put(currentChar, words[i]);
            visitedWords.add(words[i]);
        }
        return true;
    }
}
