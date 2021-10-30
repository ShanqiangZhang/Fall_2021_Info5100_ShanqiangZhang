import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question4 {
    public static List<Character> findLongestSubstring(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();

        List<Character> result = new ArrayList<>();

        if (s.length() == 0) return null;

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), 1);
                result.add(s.charAt(i));
            } else if (hashMap.containsKey(s.charAt(i))) {
                break;
            }
        }
        return result;
    }
}
