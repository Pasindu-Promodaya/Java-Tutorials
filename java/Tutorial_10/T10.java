package Tutorial_10;

public class T10 {
    public static void main(String[] args) {

        Student s1 = new Student();

        //Set value for object s1
        s1.setName("Dasun");
        s1.setId(1);

        //Get value from object s1
        System.out.println("Name = "+s1.getName());
        System.out.println("ID number = "+s1.getId());
    }
}
