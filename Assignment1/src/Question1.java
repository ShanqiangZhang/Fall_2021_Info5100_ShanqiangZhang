public class Question1 {
    public static int uniqueElementsSum(int[] nums){
        int[] count = new int[101];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
