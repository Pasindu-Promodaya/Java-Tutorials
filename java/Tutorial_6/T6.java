package Tutorial_6;

public class T6 {
    public static void main(String[] args) {

        //Create object m1
        Member m1 = new Member("Amal", 20, "Cricket");

        //Create object m2
        Member m2 = new Member("Sanka", 25);

        //Create object m3
        Member m3 = new Member("Ashen");

        //Output the vales of objects
        System.out.println("Name = "+m1.name+" "+"Age = "+m1.age+" "+"Sport = "+m1.sport);
        System.out.println("Name = "+m2.name+" "+"Age = "+m2.age+" "+"Sport = "+m2.sport);
        System.out.println("Name = "+m3.name+" "+"Age = "+m3.age+" "+"Sport = "+m3.sport);
    }

}
