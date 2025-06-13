package Tutorial_13;

public class Samsung extends Phone { //When show an error on this line, follow below step
                                     //Right click -> Show Context Action -> Implement methods -> Click the abstract method you want
    @Override
    public void call() { //Abstract method of Phone class "call" -> Override normal method "call"
        System.out.println("Inside Samsung call");
    }

    //Normal method "talk" in Phone class already has been inherited to this Samsung class

}
