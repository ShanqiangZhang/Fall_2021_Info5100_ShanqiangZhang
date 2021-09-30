import java.util.Arrays;

public class Ass1_Main {
    public static void main(String[] args) {
        System.out.println("Question1");
        System.out.println("Example1 :   " + Question1.uniqueElementsSum(new int[] {1,2,3,2}));
        System.out.println("Example2 :   " + Question1.uniqueElementsSum(new int[] {1,1,1,1}));
        System.out.println("Example3 :   " + Question1.uniqueElementsSum(new int[] {1,2,3,4,5}));
        System.out.println();

        System.out.println("Question2");
        System.out.println("Example1 :   " + Arrays.toString(Question2.sortedSquares(new int[] {-4,-1,0,3,10})));
        System.out.println("Example2 :   " + Arrays.toString(Question2.sortedSquares(new int[] {-7,-3,2,3,11})));
        System.out.println();

        System.out.println("Question3");
        System.out.print("Example1 :   " );
        Question3.findNonRepeated(new int[] {2,3,4,2,2,3,5,7});
        System.out.println();

        System.out.println("Question4");
        System.out.println("Example1 :   " + Question4.canConstruct("a","b"));
        System.out.println("Example2 :   " + Question4.canConstruct("aa","ab"));
        System.out.println("Example3 :   " + Question4.canConstruct("aa","aab"));
        System.out.println();

        System.out.println("Question5");
        System.out.println("Example1 :   " + Question5.isFollowed("1A3d4s5t"));
        System.out.println("Example2 :   " + Question5.isFollowed("A2bb2d4"));

    }
}
