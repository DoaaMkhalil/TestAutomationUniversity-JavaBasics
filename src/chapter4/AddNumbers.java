package chapter4;

import java.util.Scanner;

public class AddNumbers {
    // do while : run the statements at least once   condition controlled
    /*
    * 1- execute statements inside loop
 2- check condition inside loop
  */
    public static void main(String[] args) {
        int num1 , num2 , sum ;
        boolean again ; // conditional variable
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("enter your first number");
            num1 =scan.nextInt();
            System.out.println("enter your second number");
            num2 =scan.nextInt();
            sum = num1 + num2 ;
            System.out.println("the sum is "+ sum);
            System.out.println("do you need to continue");
            again = scan.nextBoolean();   // update sentinel
        }
       while (again);
    }
}
