package chapter10;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog sound");
    }
    public void fetch(){
        System.out.println("fetch is fun");
    }
}
