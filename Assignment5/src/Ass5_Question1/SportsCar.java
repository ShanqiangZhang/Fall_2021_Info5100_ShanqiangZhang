package Ass5_Question1;

public class SportsCar extends CarDecorator{
    public SportsCar(Car basicCar) {
        super(basicCar);
    }
    @Override
    public void assemble() {
        basicCar.assemble();
        System.out.print("Adding features of Sports Car.");
    }
}
