package Tutorial_12;

public class Son extends Father{
    //Now, "phone" method of Father Class has been inherited for Son Class

    //Create a method for Son Class that belongs to it
    @Override //This key word make sure this "phone" method is inherited from Father Class
    public void phone(){
        System.out.println("Son's phone is Samsung A03s"); //Now you call the "phone" method in T12 Class you can see it shows this "Son's phone is Samsung A03s" statement
                                                           //It shows the inherited method "phone" is replaced with new value, not value of Father Class "phone" method
    }

    /*@Override //This key word make sure this "phone" method was inherited from Father Class, now this error shows "phone" method was not inherited from Father Class
              //Method does not override method from its Super Class
              //If the name of the overridden method is somehow misspelled, we can find it using this keyword.
    public void phone1(){
        System.out.println("Son's phone is Samsung A03s");
    }*/
}
