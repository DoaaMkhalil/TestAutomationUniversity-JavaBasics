package chapter6;
// object as method parameter & return type

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //to call method or use variable in static method it must be static
        // or insantiat object even in the same class
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();
        calculator.scan.close(); // also can access nonstatic fields
        double area = calculator.calculateTotalArea(kitchen ,bathRoom);
        System.out.println("total area is : "+ area);
    }

    private  double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea()+rectangle2.calculateArea();
    }

    public Rectangle getRoom() {   // because we need to return 2 fields we can not do it ,but we can return object

        System.out.println("Enter the room length");
       double length = scan.nextDouble();
        System.out.println("Enter the room width");
        double width = scan.nextDouble();
        return new  Rectangle(length,width); // instead of create object & consume memory location
    }
}
