package chapter11;

public interface Product {
    double getPrice();
    void setPrice(double price);
    String getName();
    void setName(String color);
    String getColor();
    void setColor(String color);
   default void getBarcode(){
       // default implementation to do not break subclasses
   }
}
