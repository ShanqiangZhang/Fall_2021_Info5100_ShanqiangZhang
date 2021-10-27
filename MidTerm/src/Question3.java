import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static int sumOfRepeated(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else if (map.containsKey(nums[i])) {
                sum += nums[i];
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > 2) {
                sum -= nums[i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, 3, 4, -1};
        System.out.println(sumOfRepeated(arr));
    }
}
