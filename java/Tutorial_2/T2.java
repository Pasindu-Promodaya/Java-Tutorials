package Tutorial_2;

public class T2 {
    public static void main(String[] args) {
        //Create an Object e1
        Employee e1 = new Employee();
        e1.name = "Siril";
        e1.age = 15;

        //Call to method "ageFinder"
        e1.ageFinder();

        //Create an object e2
        Employee e2 = new Employee();
        e2.name = "Gamini";
        e2.age = 28;

        //Call to method "ageFinder"
        e2.ageFinder();

        //Override
        e1.age = 20;
        e1.ageFinder();

        //Create an object e3
        Employee e3 = new Employee();
        e3.name = "Piyal";
        e3.age = 38;
        e3.ageFinder();
        System.out.println(e3.department);
        //e3.depShower();//optional thing that I made
        //e3.department = "IT"; //give error because department is constant
    }
}
