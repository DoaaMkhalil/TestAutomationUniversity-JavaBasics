package chapter6;
// instantiating objects :
// we do not need to import rectangle class because it is in the same package
public class HomeAreaCalculator {
    public static void main(String[] args) {
        // create instance of rectangle class (create object)
        Rectangle room1 = new Rectangle();
        /*
        * Rectangle : datatype of object (class rectangle)
        * new : keyword use to instance object
        * Rectangle() : call default constructor
        * */
      room1.setLength(30);
      room1.setWidth(45);
    double area1=  room1.calculateArea();
        System.out.println("Area of room 1 is "+area1);
        // create instance of rectangle class (create object)
        Rectangle room2 = new Rectangle(30 ,45); // use another constructor
        double area2=  room2.calculateArea();
        System.out.println("Area of room 2 is "+area2);
    }
}
