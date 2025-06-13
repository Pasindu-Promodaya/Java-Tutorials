package Tutorial_15;

public class Dog implements Animal_1, Animal_2 {

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    /*@Override
    public void defaultMethod() { //If you need, you can override this default method
        Animal_1.super.defaultMethod();
    }*/

    @Override
    public void run() {
        System.out.println("Dog runs");
    }


}

