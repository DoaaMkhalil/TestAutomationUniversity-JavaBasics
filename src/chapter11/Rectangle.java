package chapter11;

public class Rectangle extends Shape{
    // class contains abstract method ,so we should override method or declare this class as abstract
    protected double length , width;

    public double getLength() {
        return length;
    }

    public Rectangle(double length,double width) {
        this.length = length;
        this.width =width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width*length;
    }
}
