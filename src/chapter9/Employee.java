package chapter9;
  // inheritance
 // extends : forms inheritance relationship
// child = subclass  ==> has access to all members at parent class
public class Employee extends Person{
  private String employeeID ,title ;
public Employee(){
    super("doaa"); // must be the first line of constructor
    // to specify which superclass constructor to call
    // without argument : default constructor
  System.out.println("Employee class");
    // default class
    // to improve that when i create instance from subclass , superclass is called first
}
    public String getEmployeeID() {
      return employeeID;
    }

    public void setEmployeeID(String employeeID) {
      this.employeeID = employeeID;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }
  }
