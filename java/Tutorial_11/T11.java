package Tutorial_11;

public class T11 {
    public static void main(String[] args) {
        //Create object by calling Child class
        Child c1 = new Child(); //When run this code, you can see Parent class Constructor was called before calls the Child class Constructor, because Inheritance feature.
                                //It happens, because there is a hide, default line in first inside code segment of the constructor called "super"

        c1.skinColor = "Tan"; //Parent attribute
        c1.age = 15; //Child attribute

        c1.parentSkill(); //Parent method
        c1.childSkill(); //Child method

        //Create object by calling Child class with default constructor
        Child c2 = new Child(); //When run this code, you can see Parent class Constructor was called before calls the Child class Constructor, because Inheritance feature
                                //It happens, because there is a hide, default line in first inside code segment of the constructor called "super"

        //Create object by calling Child class with parameterized constructor
        Child c3 = new Child("Kamal");

        //Create object by calling Child class with parameterized constructor
        Child c4 = new Child(6);

    }
}
