package chapter12;

import java.util.HashMap;
import java.util.Map;

// maps: assign value to unique key
// access elements with its key
public class Maps {
      public static void main(String[] args) {
          Map fruitCalories = new HashMap();
          // implementation of queue can be link map , hash map , tree map
          fruitCalories.put("banana",120); // put not add because map not inherit from collection technically
          fruitCalories.put("apple",160); // key =  apple , value =160
  // it can take any object not only data types
          fruitCalories.put("apple",150); // update value not add new element

          System.out.println(fruitCalories);  //{banana=120, apple=150}
          System.out.println(fruitCalories.size()); //2
          System.out.println(fruitCalories.get("apple")); //160

          fruitCalories.remove("banana");  // by key


      }
}
