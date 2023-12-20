package chapter9;

public class Square extends Rectangle{
    @Override // to remember me that it is overriding method
    //overriding inherited method : the same method signature with different behavior
    public double calculatePerimeter(){
  return 4*length;
    }
    // method overload
    public void print(String what){
        System.out.println("i am a "+ what);
    }
}
