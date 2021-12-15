package Q3;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int total = 0;
        int res = 0;
        for (int num : nums) {
            total += num;
            if (total == k) {
                res++;
            }
            if (count.containsKey(total - k)) {
                res += count.get(total - k);
            }
            count.put(total, count.getOrDefault(total, 0) + 1);
        }
        return res;
    }
}
