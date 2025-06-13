package Tutorial_14;

public class Offspring extends Animal{
    /*public Offspring() { //Related to variable "color" in super class "Animal"
        super(color);
    }*/

    //This class is already inherited by Super class "Animal"
    //Create method
    //Inherit final method "sound" from super class "Animal"
    /*@Override
    public void sound(){             //'sound()' cannot override 'sound()' in 'Tutorial_14.Animal'; overridden method is final
        System.out.println("Meow");  //This method cannot override, because "sound" is already final method
                                     //if you use override method in inherited class, you can't use final method as override method
    }*/                              //(If a final method is inherited in some way, that method cannot be overridden in the class from which it is inherited)

    /*//Create object using class "Offspring"
    static Offspring o1 = new Offspring();

    public Offspring() {
        super();
    }

    public static void main(String[] args) {
        o1.sound();
    }*/
}
