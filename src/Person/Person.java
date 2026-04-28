package Person;

abstract public class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void breathe() {
        System.out.println(name + " is breathing");
    }
}
