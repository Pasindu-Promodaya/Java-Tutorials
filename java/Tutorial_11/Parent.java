package Tutorial_11;

//Create Parent Class
public class Parent { //Super Class
    //Create features
    protected String skinColor;
    protected String eyeColor;

    //Create method
    public void parentSkill() {
        System.out.println("Singing");
    }

    //Create Default Constructor
    public Parent() {
        System.out.println("Inside the default constructor of Parent class");
    }

    //Create Parameterized Constructor
    public Parent(String b) {
        System.out.println("Inside the parameterized constructor of Parent class");
    }

    public Parent(int c) {
        System.out.println("Inside the parameterized constructor of Parent class");
    }
}
