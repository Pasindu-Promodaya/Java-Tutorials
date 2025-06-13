package Tutorial_16;
//Runtime Polymorphism

//Create class "Animal" (It is "public", but I didn't mention)
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

//Create class "Dog" inherited from class "Animal" (It is "public", but I didn't mention)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog woof");
    }

    //Create specific method in "Dog" Class
    void bark() {
        System.out.println("Dog barks");
    }
}

//Create class "Cat" inherited from class "Animal" (It is "public", but I didn't mention)
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meow");
    }
}

//Create class "Cat" inherited from class "Animal" (It is "public", but I didn't mention)
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moo");
    }
}

class T16_2 {
    public static void main(String[] args) {

        Animal a1 = new Animal(); // Instantiation (Create an object)
        a1.makeSound();           // Output: Animal sound

        Animal a2 = new Dog();  // Upcasting (Not object creation - just changing the reference type)
        a2.makeSound();         // Output: Dog barks (decided at runtime)

        Animal a3 = new Cat();  // Upcasting (Not object creation - just changing the reference type)
        a3.makeSound();         // Output: Cat meow (decided at runtime)

        // Down casting to access Cow-override method
        Animal aDown = new Cow(); // Upcasting (Not object creation - just changing the reference type)
        Cow a4 = (Cow) aDown;     // Down casting (Not object creation - just narrowing the reference)
        a4.makeSound();          // Output: Cow moo (decided at runtime)

        // Down casting to access Dog-specific method
        //First a2 must be upcast. In here it has already done on an above step
        Dog d = (Dog) a2; // Down casting (manual) (Not object creation - just narrowing the reference)
        d.bark();         // Now we can call bark() // Output: Dog barks (decided at runtime)

        // Safe down casting
        if (a2 instanceof Dog) {
            Dog myDog = (Dog) a2;  // Safe down casting
            myDog.bark();
        } else {
            System.out.println("Not a Dog!");
        }

    }
}

