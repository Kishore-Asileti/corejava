package encapsulation_Setters_Getters;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Kishore");
        s.setMarks(95);

        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}
