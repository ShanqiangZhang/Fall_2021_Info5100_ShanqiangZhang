package Q1;

public class HW3_Q1_Main {
    public static void main(String[] args) {
        Moody moody1 = new Happy();
        Moody moody2 = new Sad();
        Psychiatrist.examine(moody1);
        System.out.println();
        Psychiatrist.observe(moody1);
        System.out.println();

        Psychiatrist.examine(moody2);
        System.out.println();
        Psychiatrist.observe(moody2);
        System.out.println();
    }
}
