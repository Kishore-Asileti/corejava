package ObjectClassMethods.hashcode;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() called for " + name);
        return name.hashCode() + age;
    }

}
