public class Question3 {
    //solution1 use two array to imitate hash table
    public static void findNonRepeated(int[] arr){
        int temp = 0;
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[arr[i]]++;
        }
        for (int i = 0; i < output.length; i++) {
            if(output[arr[i]] == 1){
                System.out.println(arr[i]);
                break; // break when find first non repeated integer
            }
        }
    }
}
