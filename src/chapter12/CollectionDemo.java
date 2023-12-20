package chapter12;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args)
    {
           setDemo();
           mapDemo();
    }
    public static void setDemo()
    {
        Set fruit = new HashSet();  // set contains object
        // , if we need to specify object type we can do it
        Set<String> fruit2 = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size()); //4
        System.out.println(fruit);

        // set is unordered so i can not locate elements
        var i = fruit.iterator(); // assign each element in set to i
        while (i.hasNext()) // 'I' is not last element in set
        {
            System.out.println(i.next());
        }
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");
       for (String item : fruit2)
       {
           System.out.println(item);
       }

       fruit2.forEach(x-> System.out.println(x)); // var -> action
       //=
        fruit2.forEach( System.out::println);
    }
    public static void queueDemo()
    {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size()); //5
        System.out.println(fruit);
    }
    public static void mapDemo()
    {  // map not collection
        Map<String,Integer> fruitCalories = new HashMap();
        // declare object data type with wrapper class not primitive
        fruitCalories.put("apple",125);
        fruitCalories.put("lemon",24);
        fruitCalories.put("banana",160);
        fruitCalories.put("orange",100);
        fruitCalories.put("lemon",40);
        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories);

        for (var entry:fruitCalories.entrySet()) // turn map into set
        {
            System.out.println(entry.getValue());
        }
        fruitCalories.forEach(
                (k,v) -> System.out.println("fruit :"+k+"has " +v+" calories")
        );
    }
    public static void listDemo()
    {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size()); //5
        System.out.println(fruit.get(2)); // banana //list ordered can access elements with index
        System.out.println(fruit);
    }

}
