package Interface_Dog;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog v = new Dog("Tommy");

        System.out.println(Animal.mode); // accessing interface variable
        v.makeSound();
    }
}
