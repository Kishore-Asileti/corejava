package Constructor.Constructor_Initialization;

public class Student {
    String name;
    int age;
    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " " + age);
    }

}
