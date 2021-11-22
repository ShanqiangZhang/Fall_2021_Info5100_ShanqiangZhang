package Ass5_Question1;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car basicCar) {
        super(basicCar);
    }
    @Override
    public void assemble() {
        basicCar.assemble();
        System.out.print("Adding features of Luxury Car.");
    }

}
