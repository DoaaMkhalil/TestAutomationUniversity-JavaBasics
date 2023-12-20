package chapter7;

import java.util.Scanner;

// dynamic array length
/* Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */
public class Grades {
    // declare array without initialization
    private static int [] grades;
    private static Scanner scan = new Scanner(System.in) ;

    public static void main(String[] args) {
        System.out.println("how many grades would you like to enter ?");
        int length = scan.nextInt();
        //array initialization
        grades =new int[length];
        enterGrades();

          //////////// String.format(,) turn what i pass to the format in the first argument
        System.out.println("Average : "+ String.format("%.2f",calculateAverage()));
        System.out.println("Highest grade : " +getHighest());
        System.out.println("Lowest grade : " +getLowest());
    }

    private static int getHighest() {
        int highest = grades[0];
        for (int grade : grades)
        {
            if (grade>highest)
                highest =grade;
        }
        return highest;
    }
    private static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades)
        {
            if (grade<lowest)
                lowest =grade;
        }
        return lowest;
    }

    private static double calculateAverage() {
        return calculateGrades()/grades.length;

    }

    private static int calculateGrades() {
        int sum = 0;
        for (int grade: grades) {
            sum+=grade;
        }
        return sum;
    }

    private static void enterGrades() { // length : method to get array length
        for (int i=0;i<grades.length;i++)
        {
            System.out.println("please enter grade # "+(i+1));
            grades[i]=scan.nextInt();
        }
    }
}
