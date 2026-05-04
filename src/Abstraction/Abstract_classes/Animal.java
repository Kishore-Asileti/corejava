package Abstraction.Abstract_classes;

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping");
    }


}
