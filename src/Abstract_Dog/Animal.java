package Abstract_Dog;

public abstract class Animal {

    String name;      // instance variable
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}
