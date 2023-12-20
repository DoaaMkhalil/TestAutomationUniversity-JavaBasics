package chapter2;    //package declaration

import java.util.Scanner;
//  *be descriptive on your naming (classes , variables ,methods)*
// orange for reserved words
public class GrossPayCalculator
{         //class declaration
//                                 java is case sensitive
    public static void main(String[] args)  // default method & starting point of the program
    {
        //1. get the number of hour worked
        // to display output on console
        System.out.println("enter number of hours that employee worked");   // statement = 1 instruction
       // to receive input from user
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt(); //multiple next method for different datatype
        //2- get the hourly pay rate
        System.out.println("enter employee's pay rate");
        // variable memory location to store data
       double rate = scanner.nextDouble(); // for decimal number
        //3- multiply hours & pay rate
        double grossPay = hours * rate ;
        //4- display result
        System.out.println("the employee gross pay is $"+grossPay);
    }
}
