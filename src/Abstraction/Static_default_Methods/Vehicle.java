package Abstraction.Static_default_Methods;

public interface Vehicle {

    void start();

    // Default method
    default void fuelType() {
        System.out.println("Petrol/Diesel");
    }

    // Static method
    static void company() {
        System.out.println("Vehicle Company");
    }
}
