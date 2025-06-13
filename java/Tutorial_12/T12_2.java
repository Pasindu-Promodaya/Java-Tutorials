package Tutorial_12;

public class T12_2 {
    //This Class connect with Mother and Daughter Classes

    public static void main(String[] args) {
        //Create an object using Daughter Class
        Daughter d1 = new Daughter();

        System.out.println(d1.phone()); //Method phone gives/returns String value

        System.out.println("I use "+d1.phone()); //This is optional thing that I tried, but it is good point
    }
}
