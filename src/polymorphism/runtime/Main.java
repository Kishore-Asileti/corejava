package polymorphism.runtime;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound(); // Output: Animal makes sound
        myDog.sound();    // Output: Dog barks
        myCat.sound();    // Output: Cat meows

        //JVM finds 3Methods with same name, but it calls the method of the object type, not reference type
    }
}
