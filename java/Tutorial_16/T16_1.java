package Tutorial_16;
//Compile-time Polymorphism

class Example {
    // Static method overloading
    static void greet() { // This method is "public", but I didn't mention
        System.out.println("Hello!");
    }

    static void greet(String name) { // This method is "public", but I didn't mention
        System.out.println("Hello, " + name);
    }

}

class Calculator {
    //Instance method overloading
    int add(int a, int b) { // This method is "public", but I didn't mention
        return a + b;
    }

    double add(double a, double b) { // This method is "public", but I didn't mention
        return a + b;
    }
}

class T16_1 { // This class is "public", but I didn't mention
    public static void main(String[] args) {

        Example.greet();
        Example.greet("Pasindu");
        Example.greet("Banuka");

        Calculator c1 = new Calculator();
        System.out.println(c1.add(1, 2));
        System.out.println(c1.add(5, 3));
        System.out.println(c1.add(1.5, 2.5));
        System.out.println(c1.add(3.25, 4.5));
    }
}

