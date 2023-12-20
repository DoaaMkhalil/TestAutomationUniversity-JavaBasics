package chapter4;

import java.util.Scanner;

/* While loop : condition controlled
steps : 1- evaluate condition (we need to execute loop or not ?)
 2- execute statements inside loop
 3- recheck condition (so remember to update sentinel inside loop)   4- repeat
* sentinel : what controls the flow of the loop (conditional variable) to make sure no infinite loop

*/
public class GrossPayInputValidation {

    public static void main(String[] args) {
        //1- initialize  known values
        int rate = 15 ;
        int maxHours = 40 ;
        //2- get input for unknown values
        System.out.println("enter number of hours that you worked");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();
        //3- validate input (we do not accept overtime)
        while (hoursWorked>maxHours) // if your input is invalid try agin
        {
            System.out.println("invalid number of hours hours must be bet 1 and 40 " +
                    "please try again ");
            hoursWorked = scanner.nextInt();   // update conditional variable
            scanner.close();
            double gross = hoursWorked*rate;
            System.out.println("gross pay : $"+ gross);
        }
    }

}
