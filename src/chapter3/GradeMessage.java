package chapter3;

import java.util.Scanner;

public class GradeMessage {
    /*switch statement the same as if else-if statement
    only one case will be executed but if we miss break follow through wil be executed
     the different is the if else-if check for condition is true
     but switch check for equality only
     */
    public static void main(String[] args) {
        System.out.println("Enter your letter grade :");
        Scanner scan = new Scanner(System.in);
        // scanner does not have method to get 1 char
        String grade =scan.next();
        String message ;
        switch (grade) // variable we want to evaluate
        {
            // our cases
            case "A":
                message ="Excellent job";
                break;  // the end of this case we do not have curly braces in switch
            case "B":
                message ="Great job";
                break;
            case "C":
                message ="Good job";
                break;
            case "D":
                message ="you need to work a bit harder";
                break;
            case "F":
                message ="OOOOPS";
                break;
            default:
                message = "error , invalid grade";
                break;
        }
        System.out.println(message);
    }
}
