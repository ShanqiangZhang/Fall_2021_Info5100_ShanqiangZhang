package Q1;

public class Shape {
    //attributes
    private String name;
    private String color;
    private int perimeter;
    private int area;


    //constructors
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
    }


    //print shape method
    public String printShape() {
        return "The " + this.getName() + " has a " + this.getColor() + " color";
    }

    public int getPerimeter() {
        return perimeter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
