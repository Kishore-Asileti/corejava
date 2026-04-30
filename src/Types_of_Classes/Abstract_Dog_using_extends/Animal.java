package Types_of_Classes.Abstract_Dog_using_extends;

public abstract class Animal {

    String name;      // instance variable
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}
