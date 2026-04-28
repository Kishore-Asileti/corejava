package Abstract_Dog;

public  class Dog extends Animal{

   Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }

    void makeSound() {
        System.out.println(name + " barks");
    }

}
