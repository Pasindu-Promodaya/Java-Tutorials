package Tutorial_15;
//Create interface
//Select package name -> Right click -> New -> Java Class -> Select "Interface" -> Give interface name
public interface Animal_1 {
    //Create object
    //Animal a1 = new Animal(); //'Animal' is abstract; cannot be instantiated
                                //Cannot be created an object inside the interface

    //Create method
    void sleep(); //No need to mention these methods are "public" and "abstract"
    void eat();

    default void defaultMethod(){
        System.out.println("In default method");
    }

    static void staticMethod(){
        System.out.println("In static method");
    }
}
