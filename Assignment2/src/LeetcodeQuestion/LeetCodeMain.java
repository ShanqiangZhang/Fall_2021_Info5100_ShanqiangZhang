package LeetcodeQuestion;

import java.util.Arrays;

public class LeetCodeMain {
    public static void main(String[] args) {
        System.out.println("Question1");
        System.out.print("Example1: ");
        System.out.println(Arrays.deepToString(Question1_TransposeMatrix.transpose(new int[][] {{1,2,3},{4,5,6},{7,8,9}})));
        System.out.print("Example2: ");
        System.out.println(Arrays.deepToString(Question1_TransposeMatrix.transpose(new int[][] {{1,2,3},{4,5,6}})));
        System.out.println();

        System.out.println("Question2");
        System.out.print("Example1: ");
        System.out.println(Question2_ShortestWordDistance.shortestDistance(new String[] {"practice","makes", "perfect", "coding", "makes"}, "coding", "practice"));
        System.out.print("Example2: ");
        System.out.println(Question2_ShortestWordDistance.shortestDistance(new String[] {"practice","makes", "perfect", "coding", "makes"}, "makes", "coding"));
        System.out.println();

        System.out.println("Question3");
        System.out.print("Example1: ");
        int[] nums1 = {0,1,0,3,12};
        Question3_MoveZeroes.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
        System.out.print("Example2: ");
        int[] nums2 = {0};
        Question3_MoveZeroes.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println();

        System.out.println("Question4");
        System.out.print("Example1: ");
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        Question4_RotateImage.rotate(matrix1);
        System.out.println(Arrays.deepToString(matrix1));
        System.out.print("Example2: ");
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Question4_RotateImage.rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix2));
        System.out.print("Example3: ");
        int[][] matrix3 = {{1}};
        Question4_RotateImage.rotate(matrix3);
        System.out.println(Arrays.deepToString(matrix3));
        System.out.print("Example4: ");
        int[][] matrix4 = {{1,2},{3,4}};
        Question4_RotateImage.rotate(matrix4);
        System.out.println(Arrays.deepToString(matrix4));
        System.out.println();

        System.out.println("Question5");
        System.out.print("Example1: ");
        System.out.println(Question5_SpiralMatrix.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
        System.out.print("Example2: ");
        System.out.println(Question5_SpiralMatrix.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
        System.out.println();

        System.out.println("Question6");
        System.out.print("Example1: ");
        System.out.println(Question6_IsomorphicStrings.isIsomorphic("egg","add"));
        System.out.print("Example2: ");
        System.out.println(Question6_IsomorphicStrings.isIsomorphic("foo","bar"));
        System.out.print("Example3: ");
        System.out.println(Question6_IsomorphicStrings.isIsomorphic("paper","title"));
        System.out.println();

        System.out.println("Question7");
        System.out.print("Example1: ");
        System.out.println(Question7_AddStrings.addStrings("11","123"));
        System.out.print("Example2: ");
        System.out.println(Question7_AddStrings.addStrings("456","77"));
        System.out.print("Example3: ");
        System.out.println(Question7_AddStrings.addStrings("0","0"));
        System.out.println();

        System.out.println("Question8");
        System.out.print("Example1: ");
        System.out.println(Question8_ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.print("Example2: ");
        System.out.println(Question8_ValidPalindrome.isPalindrome("race a car"));
        System.out.println();

        System.out.println("Question9");
        System.out.print("Example1: ");
        System.out.println(Question9_ReverseWordsInAString.reverseWords("the sky is blue"));
        System.out.print("Example2: ");
        System.out.println(Question9_ReverseWordsInAString.reverseWords("hello world"));
        System.out.print("Example3: ");
        System.out.println(Question9_ReverseWordsInAString.reverseWords("a good   example"));
        System.out.print("Example4: ");
        System.out.println(Question9_ReverseWordsInAString.reverseWords("  Bob    Loves  Alice   "));
        System.out.print("Example5: ");
        System.out.println(Question9_ReverseWordsInAString.reverseWords("Alice does not even like bob"));

        System.out.println();

        System.out.println("Question10");
        System.out.print("Example1: ");
        System.out.println(Question10_StringCompression.compress(new char[] {'a','a','b','b','c','c','c'}));
        System.out.print("Example2: ");
        System.out.println(Question10_StringCompression.compress(new char[] {'a'}));
        System.out.print("Example3: ");
        System.out.println(Question10_StringCompression.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
        System.out.print("Example4: ");
        System.out.println(Question10_StringCompression.compress(new char[] {'a','a','a','b','b','a','a'}));
        System.out.println();
    }
}
