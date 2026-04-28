package Abstract_Dog;


public class AbstractMain {

    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 3);

        System.out.println(d.name);  // accessing variable
        d.makeSound();


    }
}
