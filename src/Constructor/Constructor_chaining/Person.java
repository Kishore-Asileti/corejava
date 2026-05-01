package Constructor.Constructor_chaining;

public class Person {

    String name;
    int age;

    // Default constructor
    Person() {
        this("Unknown", 0); // calls parameterized constructor
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");
    }

}
