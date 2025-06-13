package Tutorial_16;
//Runtime Polymorphism with multilevel Inheritance

//In here, inheritance occurs at three levels. (Bird <- Chicken <- babyChicken)
//Create class "Bird" (It is "public", but I didn't mention)
class Bird {
    void eat() { // Method is "public", but I didn't mention
        System.out.println("Bird eats");
    }
}

//Create class "Chicken" inherited from class "Chicken" (It is "public", but I didn't mention)
class Chicken extends Bird { // Method is "public", but I didn't mention
    @Override
    void eat() {
        System.out.println("Chicken eats");
    }
}

//Create class "babyChicken" inherited from class "Chicken" (It is "public", but I didn't mention)
class babyChicken extends Chicken { // Method is "public", but I didn't mention
    @Override
    void eat() {
        System.out.println("Baby Chicken eats");
    }
}

public class T16_3 {
    public static void main(String[] args) {

        //Create objects using Bird
        Bird b1, b2, b3;

        b1 = new Bird(); // Instantiation
        b2 = new Chicken(); // Upcasting
        b3 = new babyChicken(); // Upcasting

        b1.eat();
        b2.eat();
        b3.eat();
    }
}

