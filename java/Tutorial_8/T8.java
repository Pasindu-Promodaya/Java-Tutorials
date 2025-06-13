package Tutorial_8;

public class T8 {
    public static void main(String[] args) {

        //Create object s1
        Tuition s1 = new Tuition();
        s1.name = "Janith";
        s1.age = 15;
        //Tuition.tuition_name = "Mathematics"; //This one doesn't have value for "tuition_name" variable. So it gets value of default constructor or static block as the value for "tuition_name" (Priority for default constructor)

        //print s1, s2 objects using "show" method
        s1.show();

        //Create object s2
        Tuition s2 = new Tuition();
        s2.name = "Amila";
        s2.age = 15;
        Tuition.tuition_name = "Science"; //Always next input gets as the default value of the variable in the class, when use the static key word

        //print s1, s2 objects using "show" method
        s1.show();
        s2.show();

        //Create object s3
        Tuition s3 = new Tuition();
        s3.name = "Pubudu";
        s3.age = 15;
        Tuition.tuition_name = "Commerce"; //Always next input gets as the default value of the variable in the class, when use the static key word


        //print objects using "show" method
        s1.show();
        s2.show();
        s3.show();

        //Create object s4
        Tuition s4 = new Tuition();
        s4.name = "Radeesh";
        s4.age = 15;
        Tuition.tuition_name = "Sinhala"; //Always next input gets as the default value of the variable in the class, when use the static key word

        //print objects using "show" method
        s1.show();
        s2.show();
        s3.show();
        s4.show();

        //Create object s5
        Tuition s5 = new Tuition();
        s5.name = "Hansi";
        s5.age = 15;
        //This one doesn't have value for "tuition_name" variable. So it gets value of default constructor or previous value as the value for "tuition_name" (Priority for default constructor)

        //print objects using "show" method
        s1.show();
        s2.show();
        s3.show();
        s4.show();
        s5.show();//Last object
    }
}
