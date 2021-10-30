package Q1;

public class Psychiatrist{
    Moody moody;

    public static void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.queryMood();
    }

    public static void observe(Moody moody){
        moody.ExpressFeelings();
        System.out.println("Observation: " + moody.toString());
    }

}
