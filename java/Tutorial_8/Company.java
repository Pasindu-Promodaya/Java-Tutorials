package Tutorial_8;

public class Company {
    String name;
    int rank;
    static String location;

    static{
        location = "Colombo";
        System.out.println("Had Static block");
    }

    public Company(){
        System.out.println("Had Default constructor");
    }

    public Company(String name, int rank ){
        this.name = name;
        this.rank = rank;
        System.out.println("Had Parameterized constructor");
    }

    public void showCompany(){
        System.out.println(name+", "+rank+", "+location);
    }
}
