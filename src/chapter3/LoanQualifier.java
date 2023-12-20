package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    // nested if  : if both of this condition are met , do something
    // person must make at least $30000 & should work at his work for 2 year or more
    public static void main(String[] args) {
         // initialize what we know
        int requiredSalary = 30000;
        int requiredYearEmployed = 2 ;
        // get unknown values
        System.out.println("Enter your Salary");
        Scanner scanner = new Scanner(System.in);
       double ActualSalary = scanner.nextDouble();
        System.out.println("Enter number of years with your current employer");
       double ActualYearsOFEmployed =scanner.nextDouble();
       scanner.close();
        // make a decision
        if (ActualSalary>=requiredSalary)
        {
            if (ActualYearsOFEmployed>requiredYearEmployed)
                System.out.println("you are qualified for loan");
            else
                // true for salary but false for years
                System.out.println("sorry, you must have worked at your current job for"
                + requiredYearEmployed +"years");
        }
        else
            //false for salary
            System.out.println("sorry, you must earn at least $" + requiredSalary );
    }
}
