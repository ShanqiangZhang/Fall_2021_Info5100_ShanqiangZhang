package LeetcodeQuestion;

public class Question8_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if ("".equals(s)) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        while (tail > head) {
            char c = Character.toLowerCase(s.charAt(head));
            char d = Character.toLowerCase(s.charAt(tail));
            if (!Character.isLetterOrDigit(c)) {
                head++;
                continue;
            }
            if (!Character.isLetterOrDigit(d)) {
                tail--;
                continue;
            }
            if (c != d) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
