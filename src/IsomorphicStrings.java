import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> charsMap = new HashMap<>();
        Set<Character> visitedValue = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);
            if (!charsMap.containsKey(currentS) && !visitedValue.contains(currentT)) {
                charsMap.put(currentS, currentT);
                visitedValue.add(currentT);
            } else if (!charsMap.containsKey(currentS) || charsMap.get(currentS) != currentT) {
                return false;
            }
        }
        System.out.println(charsMap);
        return true;

    }
}
