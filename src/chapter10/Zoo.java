package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //polymorphism
        Animal sasha = new Dog();
        sasha.makeSound(); // only overriding method appears
        sasha= new Cat(); // because it is Animal type so i can change instantiation
        sasha.makeSound();
        feed(sasha);
    }
    public static void feed(Animal animal){
        // check which type of subclass this object  belong
        if(animal instanceof Dog)
        {
            System.out.println("dog food");
        }
        if(animal instanceof Cat)
        {
            System.out.println("cat food");
        }
    }
}
