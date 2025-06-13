package Tutorial_4;

public class Worker {

    //Variable declaration
    String name;
    int age;
    String department;

    //Create non-parameterized constructor without "this" key word
    public Worker(String name1, int age1, String department1) {
        name = name1;
        age = age1;
        department = department1;
    }

    //When Instance variable and Local variable name equals in the constructor without "this" key word
    /*public Worker(String name, int age, String department) {
        name = name;
        age = age;
        department = department;
    }*/

    //Create non-parameterized constructor without "this" key word
    /*public Worker(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
   }*/

}
