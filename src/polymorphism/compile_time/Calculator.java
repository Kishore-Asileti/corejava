package polymorphism.compile_time;

public class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different parameters)
    double add(double a, double b) {
        return a + b;
    }

    // Method 3
    int add(int a, int b, int c) {
        return a + b + c;
    }

}
