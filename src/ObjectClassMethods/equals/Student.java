package ObjectClassMethods.equals;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;

        return age == s.age && name.equals(s.name);
    }

}
