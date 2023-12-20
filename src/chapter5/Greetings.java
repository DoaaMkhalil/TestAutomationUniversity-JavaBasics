package chapter5;

import java.util.Scanner;

public class Greetings {
    // methods : must be inside a class
    /* method syntax : 1- method header (access modifier , non access modifier ,
     return type ,name (lowercase) , (parameter list)--> input for method)
        access modifier: public(can be accessed from any other class)
                         private(can be only accessed in this class)
                         protected(default access modifier)(can be accessed from any other class in the same package)
        non access modifier: nonstatic--> when instantiate object ^ we set state for all methods
                                          we do not need to pass any additional info when we call methods
                             static --> no state ,so we will deal with static thing direct no using object
                                        // مقدرش اتعامل مع ال static method  من خلال ال object
     2- body :{statements to execute & return
     statement(there is only one return statement in the method)}
    * */
    // write method asks user about his name & greet him

    // main method contain control flow of program (run point)
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        // call method  // must give it its list of parameters
        greetUser(name);
    }
    // another method inside class


    public static void greetUser(String userName)
    {
        System.out.println("Hi" + userName);
    }
}
