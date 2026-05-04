package Constructor.Constructor_and_setter;

public class Student {
    String name;
    int age;
    Student(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    void display() {
        System.out.println(name + " " + age);
    }

}
