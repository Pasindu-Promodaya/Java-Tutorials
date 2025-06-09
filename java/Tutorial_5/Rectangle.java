package Tutorial_5;

public class Rectangle {

    //Instance Variables
    double length;
    double width;
    static int count = 0; //Instance variable -> Class variable

    //Default Constructor
    public Rectangle(){
    length = 5;//also you can add "this" keyword
    width = 2;
    count++;
    }

    //Parameterized Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        count++;
    }

    //Calculate perimeter using method
    public double getPerimeter() {
        return (length+width)*2;
    }

    //Calculate area using method
    public double getArea() {
        return length*width;
    }

}
