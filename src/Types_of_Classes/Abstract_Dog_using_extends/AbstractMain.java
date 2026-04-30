package Types_of_Classes.Abstract_Dog_using_extends;


public class AbstractMain {

    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 3);

        System.out.println(d.name);  // accessing variable
        d.makeSound();


    }
}
