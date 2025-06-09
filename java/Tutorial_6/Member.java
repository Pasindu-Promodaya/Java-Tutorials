package Tutorial_6;

public class Member {
    //Variable declaration
    String name;
    int age;
    String sport;

    //Constructor overloading
    //Create parameterized constructors with different count of parameters
    public Member(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Member(String name) {
        this.name = name;
    }
}
