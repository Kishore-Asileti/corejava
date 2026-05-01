package Abstraction.Abstract_classes;

public class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    @Override
     void sound() {
        System.out.println(name + " barks");
    }
}
