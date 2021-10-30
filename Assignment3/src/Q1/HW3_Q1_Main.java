package Q1;

public class HW3_Q1_Main {
    public static void main(String[] args) {
        Moody moody1 = new Happy();
        Moody moody2 = new Sad();
        Psychiatrist psychiatrist1 = new Psychiatrist();
        psychiatrist1.examine(moody1);
        System.out.println();
        psychiatrist1.observe(moody1);
        System.out.println();

        psychiatrist1.examine(moody2);
        System.out.println();
        psychiatrist1.observe(moody2);
        System.out.println();
    }
}
