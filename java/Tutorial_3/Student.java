package Tutorial_3;

//Create class Student
public class Student {
    //Variable declaration
    String name;
    int age;
    String department;

    //Create default (non parameterized) constructor manually with initialized user defined values
    public Student(){
        this.name = "Rahul";
        this.age = 22;
        this.department = "IT";
    }

    //Create parameterized constructor (alt + ins)
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //parameterized constructor Overload
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
