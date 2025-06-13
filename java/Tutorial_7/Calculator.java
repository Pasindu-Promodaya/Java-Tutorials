package Tutorial_7;

public class Calculator {
    //Method overloading

    //Create a method add
    public void add(int a, int b){
        System.out.println("Total of 2 int numbers = "+(a+b));
    }

    //Method overloading with different data types
    public void add(double a, double b) {
        System.out.println("Total of 2 double numbers = "+(a+b));
    }

    //Method overloading with different parameters
    public void add(int a, int b, int c){
        System.out.println("Total of 3 int numbers = "+(a+b+c));
    }
}
