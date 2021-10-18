package Q1;

public class Sad extends Moody{

    @Override
    public String getMood() {
        System.out.println("I feel sad today");
        return null;
    }

    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ");
    }

    @Override
    public String toString() {
        System.out.println("Observation: Subject cries a lot");
        return null;
    }
}
