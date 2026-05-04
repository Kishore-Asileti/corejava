package Constructor.Copy_Constructor;

public class Student {

    String name;
    int age;

    // Normal constructor or paramerized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

}
