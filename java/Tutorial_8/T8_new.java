package Tutorial_8;

public class T8_new {
    public static void main(String[] args) {

        Company c1 = new Company(); //Assign values using default constructor
        c1.name = "Katy";
        c1.rank = 1;

        c1.showCompany();

        Company c2 = new Company("Randy", 2); //Assign values using parameterized constructor

        c2.showCompany();

        c1.showCompany();
        c2.showCompany();

        Company.location = "Kandy";

        c1.showCompany();
        c2.showCompany();
    }
}
