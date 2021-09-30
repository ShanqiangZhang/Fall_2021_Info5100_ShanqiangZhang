import java.util.Arrays;

public class Question2 {
    //solution1 directly get sortedSquares
    public static int[] sortedSquares(int[] nums){
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i] * nums[i];
        }
        Arrays.sort(output);
        return output;
    }


    //solution2 two pointers
    public static int[] sortedSquares2(int[] nums){
        int a = nums.length;
        int[] output = new int[a];
        int i = 0, j = a - 1;
        for (int right = a - 1; right >= 0 ; right--) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                output[right] = nums[i] * nums[i];
                i++;
            } else {
                output[right] = nums[j] * nums[j];
                j--;
            }
        }
        return output;
    }


}
