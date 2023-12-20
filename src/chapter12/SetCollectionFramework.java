package chapter12;

import java.util.HashSet;
import java.util.Set;
// collection frameworks 1- set: unique & unordered
public class SetCollectionFramework {
    public static void main(String[] args) {
        Set fruit = new HashSet();   // set is an interface so it can not be instance
        // implementation of set can be hash ,link ,tree
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("banana"); // it does not save the duplicate elements
        System.out.println(fruit.size());  //2
        System.out.println(fruit); // [banana, lemon]  // no control where elements are added

    }
}
