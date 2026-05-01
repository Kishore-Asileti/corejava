package Constructor.Copy_Constructor;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Kishore", 22);
        Student s2 = new Student(s1); // copy

        System.out.println(s2.name + " " + s2.age);
    }

}
