package chapter4;

import java.util.Scanner;

public class Cashier {
    /* for loop: count control
    // we know how many times the loop will run
    steps : 1- initial sentinel start and end points
        2- execute statements inside loop
        3- recheck condition
     */
    public static void main(String[] args) {
        //1- get number of item to scan
        System.out.println("how many of items you need to scan");
        Scanner scan = new Scanner(System.in);
        int quantity =scan.nextInt();
        double totalPrice = 0;
        // 2- create for loop to iterate
        // there are 3 statements inside loop start point , end point ,increment counter
        // i is the counter (sentinel of loop)
        for (int i =1 ;i<=quantity;i++)
        {
            System.out.println("enter price of item "+i);
            double price =scan.nextDouble();
            totalPrice+=price;  // accumulator
        }
        scan.close();
        System.out.println("the total price is: $"+totalPrice);
    }
}
