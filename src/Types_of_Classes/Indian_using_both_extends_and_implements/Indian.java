package Types_of_Classes.Indian_using_both_extends_and_implements;

           //"Indian" is normal class extending one abstract class and 2 Interfaces

class Indian extends Person implements EatTask, SleepTask {

    Indian(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

        public void drink() {
            System.out.println(name + " is drinking");
        }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
