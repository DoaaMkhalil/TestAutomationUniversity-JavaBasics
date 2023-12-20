package chapter6;
/* oop: key principles (4)
 this class general representation of object (does not contain main method ) must follow
     1- encapsulation : make your field access modifier private(can not access outside this class)
                      and make your method (that will be used) access modifier public
                     ( Hiding the data of a class by making its fields private and allowing access through public methods)
 */

public class Rectangle {
    // fields (variables) declaration

   private double length , width ;

    public Rectangle(){
        // default constructor used to create object from class
        length =0;
        width =0;
    }
    public Rectangle(double length,double width){
        // all constructor must have the same name as class name
        this.length =length; // we can initialize value of field by this 2 ways 1-
       setWidth(width);   //2-
    }

    public double getLength() {
        return length;  // no need to this because no other length in method scope
    }

     public void setLength(double length) {
        // getter & setter method may be a public to access from outside class
        // but i declare constructor so i will remove public
        this.length = length;   // this refers to this class
        // this specifies exactly witch length we are talking about
    }

    public double getWidth() {
        return width;
    }

   public   void setWidth(double width) {
        this.width = width;
    }

   public double calculatePerimeter()
    {
        return (2*length)+(2*width);
    }
   public double calculateArea()
    {
        return length*width;
    }
}
