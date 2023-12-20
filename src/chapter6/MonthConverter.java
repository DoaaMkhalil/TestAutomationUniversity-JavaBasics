package chapter6;
// to call static method
public class MonthConverter {
    public static void main(String[] args) {
     String month1=   Month.getMonth(3);
       int month2= Month.getMonth("October"); // call without create object
        System.out.println(month1);
        System.out.println(month2);

    }
}
