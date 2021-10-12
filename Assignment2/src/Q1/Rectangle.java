package Q1;

import Q1.Shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    //constructors
    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    //rewrite father class method
    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return width * 2 + height * 2;
    }

    //getter and setter
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
