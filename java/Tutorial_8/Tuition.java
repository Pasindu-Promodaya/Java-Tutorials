package Tutorial_8;

public class Tuition {
    //Variable declaration
    String name; //This is instance variable, it depends on object
    int age; //This is instance variable, it depends on object
    static String tuition_name; //This is static(class) variable, it depends on Class

    //Create static block
    static{ //It loads the class
        tuition_name = "English"; //Like default constructor but priority always goes to default constructor, when print the variable
        System.out.println("Had called static block");
    }

    //Create default constructor
    public Tuition(){
        tuition_name = "History"; //Default value of tuition_name
        System.out.println("Had called default constructor");
    }

    //Create method show
    public void show(){
        System.out.println("Student name = "+name+","+" Age = "+age+","+" Tuition name = "+tuition_name);
    }
}
