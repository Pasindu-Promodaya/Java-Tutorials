package Tutorial_4;

public class T4 {
    public static void main(String[] args) {
        //Create object w1 using  parameterized constructor without "this" key word
        Worker w1 = new Worker("Ajith", 35, "Finance");{
            System.out.println("Name = "+ w1.name);
            System.out.println("Age = "+ w1.age);
            System.out.println("Name = "+ w1.department);
        }

    }

}
