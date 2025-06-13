package Tutorial_11;

//Create Child Class
public class Child extends Parent{ //Sub Class
    //Now all the features and methods of Parent class are inherited to this Child class

    //Create features and methods that belongs to the Child only
    int age;
    int height;
    int weight;

    public void childSkill(){
        System.out.println("Dancing");
    }

    //Create Default Constructor
    public Child() {
        super(); //This first line, there is "super" key word in here. It calls Default Constructor of Parent class
        System.out.println("Inside the default constructor of Child class");
    }

    //Create Parameterized Constructor
    public Child(String b) {
        //super(); //This first line, there is "super" key word in here. It calls Default Constructor of Parent class
        System.out.println("Inside the parameterized constructor of Child class");
        //super(); //super() must be first statement in constructor body
    }

    public Child(int c) {
        super(c); //Calling parameter of parameterized constructor of Parent/Super Class, when you type the parameter inside the "super" key
        System.out.println("Inside the parameterized constructor of Child class");
    }
}
