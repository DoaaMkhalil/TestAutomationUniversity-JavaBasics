package chapter4;

import java.util.Scanner;

public class LetterSearch {
    // loop break :
    public static void main(String[] args) {
        // 1- get text
        System.out.println("enter some text");
        Scanner scanner = new Scanner(System.in);
        String text =scanner.next();
        boolean letterFound = false;
        //2- search in text for letter A
        for (int i=0;i<text.length();i++){   // .length()  method get #charcter that string contains
           char currentLetter = text.charAt(i); // method get char at specific index
            if (currentLetter=='A'||currentLetter=='a')
            {
             letterFound = true;
             break; // break loop no need to continue
            }
        }
        if (letterFound)
            System.out.println("text contains letter a ");
        else
            System.out.println("text contain does not letter a ");

    }
}
