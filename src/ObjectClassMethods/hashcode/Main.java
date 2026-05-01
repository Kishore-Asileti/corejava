package ObjectClassMethods.hashcode;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Kishore", 22);
        Student s2 = new Student("Kishore", 22);

        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
    }

}
