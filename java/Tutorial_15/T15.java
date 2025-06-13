package Tutorial_15;

public class T15 {
    public static void main(String[] args) {
        //Create object using interface "Animal"
        //Animal_1 a1 = new Animal_1(); //'Animal' is abstract; cannot be instantiated
                                  //Cannot be created an object using an interface

        //Create objects using class "Dog"
        Dog d1, d2, d3; //We can use this to create more objects

        d1 = new Dog();
        d2 = new Dog();
        d3 = new Dog();

        d1.sleep();
        d1.eat();
        d1.run();

        //Calling default method
        d1.defaultMethod();

        //Calling static method through interface "Animal"
        Animal_1.staticMethod();
    }
}
