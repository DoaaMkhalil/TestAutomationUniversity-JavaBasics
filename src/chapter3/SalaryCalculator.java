package chapter3;

import java.util.Scanner;
//for multi-line comment:
/*
*/
public class SalaryCalculator {
    //if statement
    // if there is 1 statement we do not need to add {}
    public static void main(String[] args)
    {
        // variable declaration
        int salary , bonus ;
        // variable initialization
     salary = 1000;   //memory locatin = value
     bonus = 250;
        Scanner scanner = new Scanner(System.in);
      int hours = scanner.nextInt();
      //if statement decision structure that executes given statements  when some condition is met
     // if statement (condition)--> should return boolean value true or false
        if(hours>40)
        { //if true
            salary+=bonus; // salary = salary + bonus
        }
        System.out.println("employee salary is $" + salary);
    }



}
