package chapter12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// collection frameworks 3- Queue: elements are not unique but ordered FIFO
public class QueueCollectionFramework {
    public static void main(String[] args) {
        Queue fruit = new LinkedList();   // set is an interface so it can not be instance
        // implementation of list can be linkList
        fruit.add("Apple");  // head
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("banana"); // it  saves the duplicate elements
        fruit.add("orange"); // tail
        System.out.println(fruit.size()); // 4
        System.out.println(fruit); // [Apple, banana, lemon, banana ,orange]

        fruit.remove();
        System.out.println(fruit); // [ banana, lemon, banana ,orange]
        fruit.peek(); // return head of queue


    }
}
