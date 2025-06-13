package Tutorial_13;

public abstract class Phone { //Can't create objects from an abstract class
                              //We cannot have objects from an abstract class
    //Create abstract method
    public abstract void call(); //Abstract method cannot have a body
                                 //Instead of curly brackets, we will use a semicolon
                                 //"abstract" key word is used to declare the method as Abstract

    //Create non-abstract method (Normal method)
    public void talk(){
        System.out.println("Give a call");
    }
}
