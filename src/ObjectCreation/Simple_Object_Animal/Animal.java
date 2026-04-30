package ObjectCreation.Simple_Object_Animal;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name; //this keyword is used to refer to the current object instance. It is often used to distinguish between instance variables and parameters with the same name. In this case, it assigns the value of the parameter name to the instance variable name of the current object.
    }

    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}
