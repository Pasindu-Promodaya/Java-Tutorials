package Tutorial_14;

public class Animal {
    //Use "final" keyword for variables
    //Create variables
    String name; //Instance variable
    final int legs_count = 4;//final Instance variable

    /*String color; //A final variable can only be initialized once, through a constructor
    public Animal(String color) {
        this.color = color;
    }*/

    /*public Animal() { //Related with o1 object creation in subclass "Offspring"

    }*/

    //Use "final" keyword for methods
    //Create method
    public final void sound()
    {    System.out.println("Meow");  //final Method
    }
}
