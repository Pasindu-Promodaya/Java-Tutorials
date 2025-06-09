package Tutorial_11;

public class T11 {
    public static void main(String[] args) {
        //Create object by calling Child class
        Child c1 = new Child();

        c1.skinColor = "Tan"; //Parent attribute
        c1.age = 15; //Child attribute

        c1.parentSkill(); //Parent method
        c1.childSkill(); //Child method
    }
}
