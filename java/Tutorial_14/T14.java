package Tutorial_14;

public class T14 {
    public static void main(String[] args) {
        //Create object using super class "Animal"
        Animal a1 = new Animal(/*"Various"*/);

        a1.name = "Cat";
        //a1.legs_count = 2; //Cannot assign a value to final variable 'legs_count'
                             //The value cannot be changed for any reason

        System.out.println("Animal name = "+a1.name);
        System.out.println("Leg count = "+a1.legs_count);
        //System.out.println("Color = "+a1.color);

        //Create object using subclass "Offspring"
        Offspring o1 = new Offspring();

        o1.sound(); //final method can be inherited
    }
}
