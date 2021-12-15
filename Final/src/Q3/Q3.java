package Q3;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static int subarraySum(int[] nums, int k) {
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

    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        System.out.println(subarraySum(nums1, 2));
        int[] nums2 = {1,2,3};
        System.out.println(subarraySum(nums2, 3));
    }
}
