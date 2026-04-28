package Static_instance_variables;

public class Main {
    public static void main(String[] args) {

        // 🔹 Object creation using 'new'
        Student s1 = new Student("Vamsi", 25);
        Student s2 = new Student("Rahul", 22);

        // 🔹 Access instance method
        s1.display();
        System.out.println("----");
        s2.display();

        // 🔹 Change static variable
        Student.changeSchool("Vijaywada School");

        System.out.println("---- After Changing School ----");

        s1.display();
        s2.display();
    }
}
