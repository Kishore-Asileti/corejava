package ObjectClassMethods;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;

        return age == s.age && name.equals(s.name);
    }

    // hashCode()
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
