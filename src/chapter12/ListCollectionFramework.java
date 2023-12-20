package chapter12;


import java.util.ArrayList;
import java.util.List;


//// collection frameworks 2- list: elements are not unique but ordered
public class ListCollectionFramework {

    public static void main(String[] args) {
        List fruit = new ArrayList();   // list is an interface so it can not be instance
        // implementation of list can be arrayList ,linkList ,stack , vector
        fruit.add("Apple");
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("banana"); // it  saves the duplicate elements
        System.out.println(fruit.get(2)); // lemon
        System.out.println(fruit.size()); // 4
        System.out.println(fruit); // [Apple, banana, lemon, banana]

    }


}
