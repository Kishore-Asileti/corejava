package inheritance;

public class Main {
    public static void main(String[] args) {

        Car c = new Car("Toyota");

        c.start();      // overridden method
        c.fuelType();  // inherited final method

        //object creation for final bike
        Bike b = new Bike();
        b.run();

        // ❌ Not allowed:
        // class SportsBike extends Bike { }  // ERROR
    }
}
