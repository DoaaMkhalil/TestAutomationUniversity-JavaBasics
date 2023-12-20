package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        // when we create object from subclass we can see all member in sub & supperClass
   emp1.getEmployeeID();
   emp1.getAge();
    }
}
