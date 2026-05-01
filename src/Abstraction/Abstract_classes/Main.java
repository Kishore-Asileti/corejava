package Abstraction.Abstract_classes;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Tommy"); // Upcasting
        a.sound(); // dog method (overridden)
        a.sleep(); //animal method
    }
}
