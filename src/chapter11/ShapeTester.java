package chapter11;

public class ShapeTester {
    public static void main(String[] args) {
        // we can not instantiate an abstract class
        ///Shape rect=new Shape() xxxxxxx
        Shape rectangle = new Rectangle(5,7);
        rectangle.print();
        System.out.println( rectangle.calculateArea()); ;

    }
}
