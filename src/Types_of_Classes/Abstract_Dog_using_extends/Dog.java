package Types_of_Classes.Abstract_Dog_using_extends;

public  class Dog extends Animal{

   Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }

    void makeSound() {
        System.out.println(name + " barks");
    }

}
