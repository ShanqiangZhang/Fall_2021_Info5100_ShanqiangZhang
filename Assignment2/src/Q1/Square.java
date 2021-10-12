package Q1;

import Q1.Shape;

public class Square extends Shape {
    private int side;

    //constructors
    public Square (int side){
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    //rewrite father class method
    public int getPerimeter() {

        return side * 4;
    }

    public int getArea() {
        return side * side;
    }
}
