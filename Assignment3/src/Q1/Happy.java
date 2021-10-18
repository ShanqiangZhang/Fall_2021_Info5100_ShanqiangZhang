package Q1;

public class Happy extends Moody{

    @Override
    String getMood() {
        System.out.println("I feel happy today");
        return null;
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHA");
    }

    @Override
    public String toString() {
        System.out.println("Observation: Subject laughs a lot");
        return null;
    }
}
