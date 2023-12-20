package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicketSearch {
    // array LotteryTicket
    private static final int LENGTH =6 ; // constant will not be changed in the program
    private static final int MAX_TICKET_NUMBER =60;
    public static void main(String[] args) {
        int[] ticket =generateNumber();
        printTicket(ticket);

    }
    public static int[] generateNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0 ;i<LENGTH;i++)
        {
            /* generate random num & make sure that it does not already exist
            ^ generate & search again
             */
            int randomNum ;
            do {
                randomNum= random.nextInt(MAX_TICKET_NUMBER);
            }while (search(ticket,randomNum)); // loop when founding num in array
            ticket[i] =randomNum;
        }
        return ticket;
    }
// javadoc comment make method readable
    /**
     * does sequential search on the array to find value
     * @param array array to search through
     * @param numToSearchFor value to search for
     * @return true if found , false if not
     */
    private static boolean search(int[] array, int numToSearchFor) {
        /*
        enhanced loop : it iterates through the array & each time assign
        the current element to the value : best when array has values not empty
         */
             for (int value :array){
               if (value==numToSearchFor)
               { return true;
               }
             }
             // end point of array
             return false ;
    }

    private static boolean binarySearch(int[] array, int numToSearchFor){
        // array must be sorted first
        Arrays.sort(array); //sort() is static method in class Array
       int index = Arrays.binarySearch(array,numToSearchFor); // return index of num if found or -1 if not
        if (index>=0)
            return true;
        else
            return false;
    }
    public static void printTicket(int[] ticket)
    {
        for (int i=0 ;i<ticket.length;i++)
        {
            System.out.print(ticket[i]+" | ");
        }
    }
}
