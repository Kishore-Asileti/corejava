package Inheritance_using_Extends_Super_Override_FinalClass;

public class Vehicle {

    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to be overridden
    void start() {
        System.out.println("Vehicle is starting");
    }

    // final method (cannot be overridden)
    final void fuelType() {
        System.out.println("Petrol/Diesel");
    }
}
