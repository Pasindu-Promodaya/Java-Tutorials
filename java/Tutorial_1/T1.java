package Tutorial_1;

public class T1 {
    public static void main(String[] args) {
        //Create object c1 using Class Car
        Car c1 = new Car();
        //initialize the attributes of Object c1
        c1.number = "KVM52033";
        c1.name = "Toyota";
        c1.color = "Red";
        c1.weight = 10000.00;
        c1.speed = 200;

        //Calling methods(functions)
        c1.name();
        c1.color();
        c1.speed();
    }
}
