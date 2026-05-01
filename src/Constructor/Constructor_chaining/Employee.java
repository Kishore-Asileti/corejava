package Constructor.Constructor_chaining;

public class Employee extends Person {

    double salary;

    Employee(String name, int age, double salary) {
        super(name, age); // calls parent constructor
        this.salary = salary;
        System.out.println("Employee constructor");
    }

}
