package Tutorial_9_2;
import Tutorial_9_1.Employee1; //Import the related package and class

public class T9_2 {
    public static void main(String[] args) {

        //Call class Employee1 in package Tutorial_9_1
        Employee1 e1 = new Employee1();

        //e1.no1 = 001; //Default access modifier, can't use

        e1.no3 = 003; //Public access modifier

        //e1.no5 = 005; //Private access modifier, can't use

        //e1.no07 = 007; //Protected access modifier, can't use
    }
}
