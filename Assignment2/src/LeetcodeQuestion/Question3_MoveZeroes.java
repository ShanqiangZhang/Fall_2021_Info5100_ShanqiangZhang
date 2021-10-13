package LeetcodeQuestion;

public class Question3_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums.length == 0 && nums == null) {
            return;
        }
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int swap = nums[i];
                nums[i] = nums[current];
                nums[current] = swap;
                current++;
            }
        }
    }
}
