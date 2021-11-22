package Ass5_Question1;

public class CarDecorator implements Car{
    protected Car basicCar = null;

    public CarDecorator(Car basicCar) {
        this.basicCar = basicCar;
    }

    @Override
    public void assemble() {
        basicCar.assemble();
    }
}
