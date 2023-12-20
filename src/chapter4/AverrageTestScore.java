package chapter4;

import java.util.Scanner;

public class AverrageTestScore {
    // nested loop
    public static void main(String[] args) {
        // 1- initialize what we know
        int numOFStudent = 24 ;
        int numOFTests = 4 ;
        Scanner scan = new Scanner(System.in);
        //2- process all students
        for (int i =0 ; i<numOFStudent ;i++)
        {
            double studentScore =0;  // accumulating variable for inside loop
            for (int j=0 ;j<numOFTests;j++) // sentinel must be different
            {
                System.out.println("enter your test score number"+(j+1));
               double score = scan.nextDouble();
               studentScore+=score; // we can not initialize it here because it will be rewritten
            }
            double avgScore = studentScore/numOFTests;
            System.out.println("student number "+(i+1)+"average score is"+ avgScore);
        }
        scan.close();
    }
}
