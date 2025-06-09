package Tutorial_11;

//Create Child Class
public class Child extends Parent{ //Sub Class
    //Now all the features and methods of Parent class are inherited to this Child class

    //Create features and methods that belongs to the Child only
    int age;
    int height;
    int weight;

    public void childSkill(){
        System.out.println("Dancing");
    }
}
