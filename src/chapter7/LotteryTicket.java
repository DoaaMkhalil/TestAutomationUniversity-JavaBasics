package chapter7;

import java.util.Random;

public class LotteryTicket {
    // array
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
            ticket[i]=random.nextInt(MAX_TICKET_NUMBER); // generate random number bet 0 and parameter
        }
        return ticket;
    }
    public static void printTicket(int[] ticket)
    {
        for (int i=0 ;i<ticket.length;i++)
        {
            System.out.print(ticket[i]+" | ");
        }
    }
}
