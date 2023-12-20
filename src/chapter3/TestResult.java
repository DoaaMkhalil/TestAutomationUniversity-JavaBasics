package chapter3;

import java.util.Scanner;

public class TestResult {
    // if else-if statement multiple paths only one will be executed
    public static void main(String[] args) {
         // get the test score
        System.out.println("Enter your Test score :");
        Scanner scan = new Scanner(System.in);
        double score =scan.nextDouble();
        // determine the letter grade
        char grade ; //hold exactly 1 character
        // make decision
        if (score<60)
            grade ='F'; // single quotation for char data type value & double quotation for String data type
        else if (score<70)
            grade ='D';
        else if (score<80)
            grade ='C';
        else if (score<90)
            grade ='B';
        else
            grade = 'A';

        System.out.println("your grade is" + grade);
    }
}
