package chapter9;
// parent = superclass
public class Person {
  private   String name , gender;
   private int age;
public Person(){
    System.out.println("Person class");
    // default class
}
    public Person(String name){
        System.out.println("Person class 2nd constructor");
        // default class
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
