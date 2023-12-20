package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    // variable scope : variables are valid only within scope ({}) in which they were defined
 // static because the methods are static
   static int requiredSalary = 25000;
   static int requiredCreditScore = 700 ;
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // 1- initialize what we know at the highest scope

        //2- get what we do not know by methods
            double salary = getSalary(); // variable must be the same datatype of method return type
           int score =  getCreditScore();
           scan.close();
             // 3- check if user is qualified by methods
      boolean qualified =  isUserQualified(salary,score); // 2 different memory location for passing parameter & method parameter
      // 4- notify user
        notifyUser(qualified);
    }

    private static void notifyUser(boolean isQualified) {
        if(isQualified)
            System.out.println("congrats! ,you have been approved");
        else
            System.out.println("you have been declined");
    }

    private static boolean isUserQualified(double salary ,int creditScore )
    {

        if(salary>requiredSalary &&creditScore >requiredCreditScore )  // logical operators eliminate using of nested if
        {
            // will return 1 of both
             return true ;
        }
        else
        {return false ;}
    }

    public  static double getSalary(){
        System.out.println("enter your current salary");
        double salary = scan.nextDouble();
        return salary;
    }
    public  static int getCreditScore(){
        System.out.println("enter your credit score");
        int creditScore = scan.nextInt();
        return creditScore;
    }

}
