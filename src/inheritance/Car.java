package inheritance;

public class Car extends Vehicle {

    Car(String brand) {
        super(brand);  // calling parent constructor
    }

    @Override
    void start() {
        System.out.println(brand + " car is starting");
    }
}
