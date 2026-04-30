package ObjectCreation.Static_and_instance_variables;

public class Student {
    // 🔹 Instance variables (fields)
    String name;
    int age;

    // 🔹 Static variable (shared across all objects)
    static String schoolName = "Eluru School";

    // 🔹 Constructor
    Student(String name, int age) {
        this.name = name;   // using 'this' keyword
        this.age = age;
    }

    // 🔹 Instance method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
    }

    // 🔹 Static method
    static void changeSchool(String newSchool) {
        schoolName = newSchool;
    }
}
