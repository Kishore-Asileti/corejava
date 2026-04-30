package Types_of_Classes.Indian_using_both_extends_and_implements;

abstract public class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void breathe() {
        System.out.println(name + " is breathing");
    }
}
