package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    // if else statement
    public static void main(String[] args) {
        // initialize values we know
        int quota =10;
        // get unknown values
        System.out.println("enter the number of sales you made this week");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close(); // because i do not need scanner again
        // make a decision on the path to take - output
       if(sales>quota)
       // if condition is true do this
       {
           System.out.println("congrats you have met your quota ");
       }
       // if condition is false do this
       else // no need to type condition because this is false of if condition
       {
           int salesShort = quota - sales;
           System.out.println("you do not make your quota ,you were" + salesShort +"sales short");
       }

    }
}
