package Person;

public class Main {
    public static void main(String[] args) {
        Indian p = new Indian("Rajini kanth");

        p.breathe();  // from abstract class
        p.eat();      // from EatTask
        p.sleep();    // from SleepTask

    }
}
