package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args) {
        createFile();
        numberExceptionHandling();
    }

    private static void numberExceptionHandling() {
        File file = new File("D:\\Java file/doaa.txt");
        Scanner fileScan =null;
        try {  // if you do not find file to read from
         fileScan   = new Scanner(file);
            while (fileScan.hasNext())
            {
                double num = fileScan.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (Exception e)
        {
            // all exception inherits from class Exception
            // so if any other exception throw this
        }
        // we can merge exceptions handling in one catch clause:
        //catch (InputMismatchException | FileNotFoundException e)
        finally {
            fileScan.close(); // سواء نفذت try او catch اعمل ده ف الاخر
        }


        // try with resources

        try(Scanner fileScan2   = new Scanner(file)) {
            while (fileScan2.hasNext())
            {
                double num = fileScan2.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }

    private static void createFile() {
        File file = new File("D:\\Java file/doaa.txt"); // path / file_name.extension
        try {   // if you find folder
            file.createNewFile();
        } catch (IOException e) { // // if you do not find folder
            System.out.println("folder does not exist");
        }
    }
}
