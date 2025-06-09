package Tutorial_5;

public class T5 {
    public static void main(String[] args) {
        //Create object r1 and calculate their perimeter and area
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 perimeter = "+r1.getPerimeter()+" area = "+r1.getArea());
        System.out.println("Count for this rectangle = "+Rectangle.count);

        //Create object r2 and calculate their perimeter and area
        Rectangle r2 = new Rectangle(10, 5);
        System.out.println("Rectangle 2 perimeter = "+r2.getPerimeter()+" area = "+r2.getArea());
        System.out.println("Count for this rectangle = "+Rectangle.count);

        //Create object r3 and calculate their perimeter and area
        Rectangle r3 = new Rectangle(8, 4);
        System.out.println("Rectangle 3 perimeter = "+r3.getPerimeter()+" area = "+r3.getArea());
        System.out.println("Count for this rectangle = "+Rectangle.count);
        //Change value of r1 object and calculate perimeter and area
        r1.length = 6;
        r1.width = 4;
        System.out.println("After values changed, Rectangle 1 perimeter = "+r1.getPerimeter()+" area = "+r1.getArea());

        System.out.println("Total count = "+Rectangle.count);
    }

}
