package Inheritance_using_Extends_Super_Override_FinalClass;

public class Car extends Vehicle {

    Car(String brand) {
        super(brand);  // calling parent constructor
    }

    @Override
    void start() {
        System.out.println(brand + " car is starting");
    }
}
