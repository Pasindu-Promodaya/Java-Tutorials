package Tutorial_2;

public class Employee {
    //Instance variables
    String name;
    int age;
    final String department = "Finance";

    public void ageFinder() {
        //Local Variables
        String a = "Adult";
        String c = "Child";

        System.out.println(name);
        System.out.println(age);

        //Condition
        if (age>18){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }


    }

    public void depShower(){
        System.out.println(department);
    }
}


