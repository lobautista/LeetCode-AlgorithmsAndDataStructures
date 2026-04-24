public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (j < t.length()) {
            if (i == s.length()) {
                return true;
            }
            if (t.charAt(j) == s.charAt(i)) {
                i ++;
            }
            j ++;
        }
        return false;
    }
}
