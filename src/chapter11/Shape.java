package chapter11;
// abstraction: something exist in theory but not have concrete existence
// serve as parent class for specific subclasses to extent from
public abstract class Shape {
    //abstract: non access modifier (method ,class)means that it is template
    abstract double calculateArea();// notes that we should be able to calculate area of shape
        // abstract method has nobody
    // abstract method must be in abstract class

    public void print(){
        // abstract class can contains implemented methods ;
        System.out.println(" this is shape");
    }


}
