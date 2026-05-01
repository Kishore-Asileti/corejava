package Types_of_Classes.Indian_using_both_extends_and_implements;

public class Main {
    public static void main(String[] args) {
        Indian p = new Indian("Rajini kanth");

        p.breathe();  // from abstract class
        p.eat();      // from EatTask
        p.sleep();
        p.drink();// from SleepTask

    }
}
