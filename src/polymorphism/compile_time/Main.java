package polymorphism.compile_time;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(2, 3));        // int version
        System.out.println(cal.add(2.5, 3.5));    // double version
        System.out.println(cal.add(1, 2, 3));     // 3 params

        // At complie time JVM detects that, method name is same but methods works on different parameters
    }
}
