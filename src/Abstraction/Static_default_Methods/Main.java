package Abstraction.Static_default_Methods;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType(); // default method

        Vehicle.company(); // static method
    }
}
