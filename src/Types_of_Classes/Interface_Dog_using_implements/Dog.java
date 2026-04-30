package Types_of_Classes.Interface_Dog_using_implements;

public class Dog implements Animal{

    String name;

    Dog(String name) {
        this.name = name;
    }

    // must implement interface method
    public void makeSound() {
        System.out.println(name + " barks");
    }
}
