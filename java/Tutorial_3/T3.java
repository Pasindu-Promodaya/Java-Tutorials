package Tutorial_3;

public class T3 {
    public static void main(String[] args) {
        //Create object s1
        Student s1 = new Student();
            /*System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.department);*/

            System.out.println("Name = "+s1.name);
            System.out.println("Age = "+s1.age);
            System.out.println("Department = "+s1.department);

            /*System.out.println(s1.name+" "+s1.age+" "+s1.department);

            System.out.println("Name = "+s1.name+" "+"Age = "+s1.age+" "+"Department = "+s1.department);*/

        //Create object s2 using Parameterized constructor
        Student s2 = new Student("Nimal", 25, "Engineering");
            System.out.println("Name = "+s2.name);
            System.out.println("Age = "+s2.age);
            System.out.println("Department = "+s2.department);

        //Create object s3 using Parameterized constructor - Overload
        Student s3 = new Student("Amali", 23);
            System.out.println("Name = "+s3.name);
            System.out.println("Age = "+s3.age);
            System.out.println("Department = "+s3.department);

    }
}
