package Tutorial_13;

public class T13 {
    public static void main(String[] args) {

        //Create object using abstract class "Phone"
        //Phone p1 = new Phone(); //"Phone" is abstract, cannot be instantiated

        //Create object using class "Samsung"
        Samsung s1 = new Samsung();

        s1.call();
        s1.talk();
    }
}
